/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.floatfrog.asjava;

import com.floatfrog.asjava.exception.ReturnTypeException;
import com.floatfrog.asjava.exception.AbstractEAEException;
import com.floatfrog.asjava.exception.CallbackException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @version .02
 * @author Michael Archibald
 */
public class EvonyActionGenerator {
    public final String PUB_STAT_FIN = "public static final ";
    List<String> javaClass, javaInterface;
    int globalCurrentLineNumber;
    String crntLine;
    ArrayList<String> wholeASClass = null;
    String className;
    ArrayList<String> classVars, classImports;
    HashMap interfaceStaticVars;
    ArrayList<ArrayList<String>> classMethods;
    ArrayList<String> crntFunc;
    ArrayList<String[]> crntFuncParams;
    String crntFuncName, crntFuncRet, crntFuncCallback, crntFuncCommand;
    int varOrFunctionIndex;
    String[] firstDivision;
    boolean alternateConfiguration = false;
    String javaClassVersion = ".02";

    public static void main(String[] args) {
//        mainDefault(args);
//        mainTest(args);
        mainParseMultible(args);
    }

    public static void mainDefault(String[] args) {
        EvonyActionGenerator eax = null;
        ArrayList<String> asClass = null;
        if(args.length > 0) {
            asClass = Util.readFile(args[0], args[1]);
        }
        if(asClass != null) {
            eax = new EvonyActionGenerator(asClass);
            eax.parse();
        }
        else {
            throw new Error("Invalid operation.");
        }
    }

    public static void mainTest(String[] args) {
        EvonyActionGenerator eax;
        String folder = "C:\\astojava\\commandtojava";
        ArrayList<String> asClass = Util.readFile(folder, "AllianceCommands.as");
        eax = new EvonyActionGenerator(asClass);
        eax.setAlternateConfiguration(true);
        eax.parse();
        eax.saveJavaFiles(folder);
    }

    public static void mainParseMultible(String[] args) {
        parseMultibleFiles("C:\\Documents and Settings\\HP_Administrator\\My Documents"
                + "\\FB3\\~EvonyClient386\\src\\com\\evony\\client\\action",
                "C:\\Documents and Settings\\HP_Administrator\\My Documents"
                + "\\NetBeansProjects\\epbtest\\epB1\\src\\evonyproxy\\command");
    }

    public static void parseMultibleFiles(String inputFolder, String outputFolder) {
        EvonyActionGenerator eax;
        File inFolder = new File(inputFolder);
        File[] inFiles = inFolder.listFiles();
        ArrayList<String> currentFile;

        /* Change ActionFactory.as file to null */
        for(int i = 0; i < inFiles.length; i++) {
            File file = inFiles[i];
            if(file.getName().equals("ActionFactory.as")) {
                inFiles[i] = null;
                break;
            }
        }

        for(File file : inFiles) {
            if(file != null) {
                currentFile = Util.readFile(inputFolder, file.getName());
                eax = new EvonyActionGenerator(currentFile);
                eax.setAlternateConfiguration(true);
                eax.parse();
                eax.saveJavaFiles(outputFolder);
            }
        }
    }

    public EvonyActionGenerator(ArrayList<String> wholeASClass) {
        initialize();
        this.wholeASClass = wholeASClass;
    }

    public EvonyActionGenerator() {
        initialize();
    }

    public void parse() {
        while(globalCurrentLineNumber < wholeASClass.size() - 1) {
            nextCrntLine();
            if(!crntLine.equals("") && !crntLine.equals("{") && !crntLine.equals("}")) {
                analyzeLine();
            }
        }
        makeJavaClass();
        makeJavaInterface();
    }

    protected void nextCrntLine() {
        /* globalCurrentLineNumber starts at -1 */
        globalCurrentLineNumber++;
        crntLine = wholeASClass.get(globalCurrentLineNumber).trim();
    }

    protected ArrayList<String> analyzeLine() {
        crntLine = crntLine.replaceAll(";", ""); // Need to modify so that it does not fuck with things inside quotes
        firstDivision = crntLine.split(" ");

        if(firstDivision[0].equals("package")) {
            /* Handle package line here if needed */
        }
        else {
            if(firstDivision[0].equals("import")) {
                handleImport();
            }
            else {
                if(firstDivision[1].equals("class")) {
                    className = firstDivision[2];
                }
                else {
                    varOrFunction();
                }
            }
        }

        return null;
    }

    protected void handleImport() {
        String imp = firstDivision[1];
        String[] impSplit = imp.split("\\.");
        if(!impSplit[0].equals("flash") && !impSplit[0].equals("mx")) {
            if(impSplit.length > 2) {
                if(impSplit[0].equals("com") && impSplit[1].equals("evony")) {
                    imp = "import evonyproxy.";
                    for(int i = 2; i < impSplit.length; i++) {
                        imp += impSplit[i];
                        if(i != impSplit.length - 1) {
                            imp += ".";
                        }
                    }
                    imp += ";";
                    if(!alternateConfiguration) {
                        classImports.add(imp);
                    }
                }
                else {
                    classImports.add(crntLine + ";");
                }
            }
            else {
                classImports.add(crntLine + ";");
            }
        }
    }

    protected void varOrFunction() {
        if(firstDivision[varOrFunctionIndex].equals("var")) {
            handleVar();
        }
        else {
            if(firstDivision[varOrFunctionIndex].equals("function")) {
                handleFunction();
            }
            else {
                /* TODO: Remove functionality that allows for no public/private declared */
                varOrFunctionIndex--;
                if(varOrFunctionIndex >= 0) {
                    varOrFunction();
                }
                else {
                    throw new Error("String is not var or function." + "\n" + crntLine);
                }
            }
        }
    }

    protected void handleFunction() {
        crntFunc = new ArrayList<String>();
        crntFuncParams = new ArrayList<String[]>();
        crntFuncName = null;
        crntFuncRet = null;
        crntFuncCallback = null;
        crntFuncCommand = null;

        handleFunctionSeperate();
        handleFunctionGetName();

        /* If function is constructer or setSender, dont handle */
        if(!crntFuncName.equals(className) && !crntFuncName.equals("setSender")) {
            try {
                handleFunctionGetParameters();
                handleFunctionGetReturn();
                handleFunctionGetCallback();
            } catch(ReturnTypeException rte) {
                System.out.println(rte.getMessage() + " in Function "
                        + rte.getCauseFunction() + " of Class "
                        + rte.getCauseClass() + " (make sure Function's return "
                        + "type is seperated with \" : \")");
                System.exit(1);
            } catch(CallbackException ce) {
                System.out.println(ce.getMessage() + " in Function "
                        + ce.getCauseFunction() + " of Class "
                        + ce.getCauseClass() + " (make sure name of callback "
                        + "Function is callbackMethod)");
                System.exit(1);
            }

            handleFunctionGetCommand();
            makeMethodWithCallback();
            makeMethodWithoutCallback();
        }
    }

    private void handleFunctionSeperate() {
        crntFunc.add(crntLine);
        do {
            nextCrntLine();
            crntFunc.add(crntLine);
        } while(!crntLine.contains("end function"));
    }

    private void handleFunctionGetName() {
        String[] tmpSplit = (crntFunc.get(0)).split(" ");
        tmpSplit = tmpSplit[2].split("\\(");
        crntFuncName = tmpSplit[0];
    }

    private void handleFunctionGetParameters() {
        String str = crntFunc.get(0);
        int start, end;
        String paramPre = "";
        String[] tmpSplit;

        start = str.indexOf('(') + 1;
        end = str.indexOf(')');
        if(start == -1 || end == -1) {
            throw new Error("Unable to find start or end point for parameters list.");
        }

        paramPre = str.substring(start, end);
        tmpSplit = paramPre.split(", ");

        String[] tmpSplitSplit;
        /* Removes AS inline parameter decleration */
        for(int i = 0; i < tmpSplit.length; i++) {
            tmpSplitSplit = tmpSplit[i].split(" = ");
            tmpSplit[i] = tmpSplitSplit[0];
        }

        for(String string : tmpSplit) {
            tmpSplitSplit = string.split(":");
            if(tmpSplitSplit[1].equals("Function")) {
                tmpSplitSplit[1] = "Method";
            }
            crntFuncParams.add(tmpSplitSplit);
        }
    }

    private void handleFunctionGetReturn() throws ReturnTypeException {
        String[] tmpSplit = crntFunc.get(0).split(" : ");
        if(tmpSplit.length > 1) {
            crntFuncRet = tmpSplit[tmpSplit.length - 1];
        }
        else {
            throw new ReturnTypeException(className, crntFuncName);
        }
    }

    private void handleFunctionGetCallback() throws CallbackException {
        String[] tmpSplit;

        for(String string : crntFunc) {
            tmpSplit = string.split(" = ");
            if(tmpSplit.length > 1) {
                if(tmpSplit[1].equals("callbackMethod;")) {
                    crntFuncCallback = tmpSplit[0].substring(5);
                    break;
                }
            }
        }
        if(crntFuncCallback == null) {
            throw new CallbackException(className, crntFuncName);
        }
    }

    private void handleFunctionGetCommand() {
        String commandLine = null;
        String[] tmpSplit;

        for(String string : crntFunc) {
            if(string.startsWith("sender")) {
                commandLine = string;
                break;
            }
        }
        if(commandLine == null) {
            throw new Error("Failed to find the line that contains the command to be sent.");
        }

        tmpSplit = commandLine.split("\"");
        crntFuncCommand = tmpSplit[1];

        interfaceStaticVars.put(crntFuncCommand, handleFunctionGetCommandMakeName(crntFuncCommand));
    }

    private String handleFunctionGetCommandMakeName(String cmd) {
        /* Because '\' is escape char in Java, using "\\." to split at '.' */
        cmd = (cmd.split("\\."))[1];

        cmd = handleFunctionGetCommandMakeNameAddUnderscores(cmd);
        cmd = cmd.toUpperCase();

        return cmd;
    }

    private String handleFunctionGetCommandMakeNameAddUnderscores(String cmd) {
        String regex = "[A-Z]";
        ArrayList<String> splitByCaps = new ArrayList<String>();

        String tmp;
        while(cmd.length() > 0) {
            /* BUG !Critical: if cmd.length - 2 || -1 is a caps then program crashes */
            for(int n = 2; n <= cmd.length(); n++) {
                tmp = cmd.substring(n - 1, n);
                if(tmp.matches(regex) || n == cmd.length()) {
                    splitByCaps.add(cmd.substring(0, n - 1));
                    if(n != cmd.length()) {
                        cmd = cmd.substring(n - 1, cmd.length());
                    }
                    else {
                        splitByCaps.set(splitByCaps.size() - 1, splitByCaps.get(splitByCaps.size() - 1) + tmp);
                        cmd = "";
                    }
                    break;
                }
            }
        }

        for(int i = 0; i < splitByCaps.size() - 1; i++) {
            cmd += splitByCaps.get(i) + "_";
        }
        cmd += splitByCaps.get(splitByCaps.size() - 1);

        return cmd;
    }

    protected void handleVar() {
        String javaVarLine = "";
        /* secondDivision[0] is variable name, [1] var type */
        String[] secondDivision = firstDivision[2].split(":");
        if(secondDivision[1].equals("Function")) {
            secondDivision[1] = "Method";
        }

        /* Prevents Sender var as it is to be implemented in superclass */
        if(secondDivision[1].equals("Sender")) {
            return;
        }

        /* if public/private/protected stated in line */
        if(varOrFunctionIndex >= 1) {
            javaVarLine += firstDivision[0] + " ";
        }
        else {
            javaVarLine += "private" + " ";
        }
        javaVarLine += secondDivision[1] + " ";
        javaVarLine += secondDivision[0];
        javaVarLine += " = null" + ";";

        classVars.add(javaVarLine);
    }

    protected void makeMethodWithoutCallback() {
        ArrayList<String> meth = new ArrayList<String>();
        String tmpStr = "";
        String[] tmpStrs;

        meth = makeMethodDoc(meth);

        /* Forcing public methods for now */
        tmpStr += "public" + " ";
        if(!alternateConfiguration) {
            tmpStr += crntFuncRet + " ";
        }
        else {
            tmpStr += "void" + " ";
        }
        tmpStr += crntFuncName + "(";

        /* This is only able to filter out callbackMethod because it is always the last param */
        for(int i = 0; i < crntFuncParams.size() - 1; i++) {
            tmpStrs = crntFuncParams.get(i);
            tmpStr += tmpStrs[1] + " " + tmpStrs[0];
            if(i != crntFuncParams.size() - 2) {
                tmpStr += ", ";
            }
        }
        tmpStr += ") {";
        meth.add(tmpStr);

        tmpStr = "";
        if(!alternateConfiguration) {
            tmpStr = "return ";
        }
        tmpStr += crntFuncName + "(";
        for(int i = 0;
                i < crntFuncParams.size()
                - 1; i++) {
            tmpStrs = crntFuncParams.get(i);
            tmpStr += tmpStrs[0] + ", ";
        }
        tmpStr += "null" + ");";
        meth.add(tmpStr);
        meth.add("}");

        classMethods.add(meth);
    }

    private void makeMethodWithCallback() {
        ArrayList<String> meth = new ArrayList<String>();
        String tmpStr = "";

        meth = makeMethodDoc(meth);

        /* Forcing public methods for now */
        tmpStr += "public" + " ";
        if(!alternateConfiguration) {
            tmpStr += crntFuncRet + " ";
        }
        else {
            tmpStr += "void" + " ";
        }
        tmpStr += crntFuncName + "(";

        String[] strs;

        for(int i = 0; i
                < crntFuncParams.size(); i++) {
            strs = crntFuncParams.get(i);
            tmpStr += strs[1] + " " + strs[0];

            if(i != crntFuncParams.size() - 1) {
                tmpStr += ", ";
            }
        }
        tmpStr += ") {";
        meth.add(tmpStr);

        meth.add("ASObject aso = new ASObject();");
        meth.add("");

        tmpStr = "";
        tmpStr += crntFuncCallback + " = " + "callbackMethod" + ";";
        meth.add(tmpStr);
        meth.add("");

        /* Adds key-value set declerations to the method */
        for(String[] param : crntFuncParams) {
            if(!param[1].equals("Method")) {
                tmpStr = "";
                tmpStr += "aso.put(\"" + param[0] + "\", " + param[0] + ");";
                meth.add(tmpStr);
            }
        }

        meth.add("if (sender != null && serializer != null) {");
        tmpStr = "sender.passDataToServer(" + "serializer.serialize(";
        tmpStr += interfaceStaticVars.get(crntFuncCommand) + ", ";
        tmpStr += "aso" + "));";
        meth.add(tmpStr);
        meth.add("}");

        meth.add("");

        if(!alternateConfiguration) {
            meth.add("return null;");
        }
        meth.add("}");

        classMethods.add(meth);
    }

    private ArrayList<String> makeMethodDoc(ArrayList<String> meth) {
        String tmpStr = "";

        meth.add("/**");

        tmpStr = "";
        tmpStr += "* ";
        tmpStr += "Command: " + crntFuncCommand;
        meth.add(tmpStr);

        tmpStr = "";
        tmpStr += "* ";
        tmpStr += "Response: " + crntFuncRet;
        meth.add(tmpStr);

        meth.add("*/");
        return meth;
    }

    protected void makeJavaClass() {
        javaClass = new ArrayList<String>();
        String tmpStr = "";

        javaClass.add("package evonyproxy.command;");
        javaClass.add("");

        for(String imp : classImports) {
            javaClass.add(imp);
        }
        javaClass.add("");

        javaClass = (ArrayList<String>) makeJavaClassDoc(javaClass);

        tmpStr = "public class ";
        tmpStr += className + " ";
        tmpStr += "extends Commands ";
        tmpStr += "implements ";
        tmpStr += "I" + className + " {";
        javaClass.add(tmpStr);

        for(String var : classVars) {
            javaClass.add(var);
        }
        javaClass.add("");

        for(ArrayList<String> methArray : classMethods) {
            for(String methStr : methArray) {
                javaClass.add(methStr);
            }
            javaClass.add("");
        }
        javaClass.set(javaClass.size() - 1, "}");
    }

    protected void makeJavaInterface() {
        javaInterface = new ArrayList<String>();
        Set keyset = interfaceStaticVars.keySet();
        String tmpStr = "";

        javaInterface.add("package evonyproxy.command;");
        javaInterface.add("");

        javaInterface = (ArrayList<String>) makeJavaClassDoc(javaInterface);

        tmpStr = "public interface I";
        tmpStr += className + " {";
        javaInterface.add(tmpStr);


        for(Object obj : keyset) {
            javaInterface.add("");
            makeJavaInterfaceStaticDoc((String) obj);
            obj = (String) obj;
            tmpStr = PUB_STAT_FIN + "String ";
            tmpStr += (String) interfaceStaticVars.get(obj) + " = \"";
            tmpStr += obj + "\";";
            javaInterface.add(tmpStr);


        }

        javaInterface.add("}");
    }

    private void makeJavaInterfaceStaticDoc(String value) {
        javaInterface.add("/**");
        javaInterface.add("* " + value);
        javaInterface.add("*/");
    }

    protected List<String> makeJavaClassDoc(List<String> javaClass) {
        javaClass.add("/**");
        javaClass.add("* " + "@version " + javaClassVersion);
        javaClass.add("* " + "@author " + "Michael Archibald");
        javaClass.add("*/");
        return javaClass;
    }

    public void saveJavaFiles(String folder) {
        saveJavaClass(folder);
        saveJavaInterface(folder);
    }

    public void saveJavaClass(String folder) {
        Util.writeFile((ArrayList<String>) javaClass, folder, className + ".java");
    }

    public void saveJavaInterface(String folder) {
        Util.writeFile((ArrayList<String>) javaInterface, folder, "I" + className + ".java");
    }

    protected void initialize() {
        firstDivision = null;
        crntLine = null;
        javaClass = new ArrayList<String>();
        javaInterface = new ArrayList<String>();
        className = null;
        classVars = new ArrayList<String>();
        interfaceStaticVars = new HashMap();
        classMethods = new ArrayList<ArrayList<String>>();
        classImports = new ArrayList<String>();
        varOrFunctionIndex = 1;
        globalCurrentLineNumber = -1;

        crntFunc = new ArrayList<String>();
        crntFuncName = null;
        crntFuncCallback = null;
        crntFuncCommand = null;
        crntFuncParams = new ArrayList<String[]>();
        crntFuncRet = null;

        classImports.add("import flex.messaging.io.amf.ASObject;");
        classImports.add("import java.lang.reflect.Method;");
        classImports.add("import java.util.ArrayList;");

    }

    /**
     * If is alternateConfiguration non existing return values are replaced with null.
     * Corrosponding Imports are also removed.
     * @param alternateConfiguration
     */
    public void setAlternateConfiguration(boolean alternateConfiguration) {
        this.alternateConfiguration = alternateConfiguration;

    }

    public void setJavaClassVersion(String version) {
        javaClassVersion = version;
    }
}
