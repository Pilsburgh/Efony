/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.floatfrog.asjava;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @version .02
 * @author Michael Archibald
 */
public class EvonyBeanGenerator extends EvonyActionGenerator {
    //TODO: Prevent this thing from removing the numbers from x1 x2 vars in the MapInfos
    List<Boolean> classVarsAreNative = new ArrayList<Boolean>();
    String packageStr = "defaultPackageLine";
    List<String> classStaticVars = new ArrayList<String>();
    List<String> beanNameList = new ArrayList<String>();
//    ArrayList<String> arrayNameList = new ArrayList<String>();
    Stack<String> arrayNameList = new Stack<String>();
    Map<String, String> arrayBeanMap = new HashMap<String, String>();

    public static void main(String[] args) {
//        mainTest(args);
//        mainParseFolder(args);
        mainParseMultibleFolders(args);
    }

    public static void mainTest(String[] args) {
        EvonyBeanGenerator ebg;
        String folder = "C:\\astojava\\beantojava";
        ArrayList<String> asClass = Util.readFile(folder, "PlayerBean.as");
        ebg = new EvonyBeanGenerator(asClass);
        ebg.setAlternateConfiguration(true);
        ebg.parse();
        ebg.saveJavaClass(folder);
    }

    public static void mainParseFolder(String[] args) {
        if(args.length < 2) {
            parseMultibleFiles("C:\\Documents and Settings\\HP_Administrator\\My Documents"
                    + "\\FB3\\~EvonyClient386\\src\\com\\evony\\common\\paramBeans",
                    "C:\\Documents and Settings\\HP_Administrator\\My Documents"
                    + "\\NetBeansProjects\\blaze\\epB1\\src\\evonyproxy\\common\\paramBeans");
        }
        else {
            parseMultibleFiles(args[0], args[1]);
        }
    }

    public static void mainParseMultibleFolders(String[] args) {
        String inputBase = "C:\\Documents and Settings\\HP_Administrator\\My Documents"
                + "\\FB3\\~EvonyClient386\\src\\com\\evony\\common";
        String outputBase = "C:\\Documents and Settings\\HP_Administrator\\My Documents"
                + "\\NetBeansProjects\\blaze\\epB1\\src\\evonyproxy\\common";
        String module = "\\module\\";

        ArrayList<String> inFolders = new ArrayList<String>();
        ArrayList<String> outFolders = new ArrayList<String>();
        ArrayList<String> moduleSubfolders = new ArrayList<String>();
        ArrayList<String> otherFolders = new ArrayList<String>();

        otherFolders.add("\\paramBeans");
        otherFolders.add("\\beans");
        otherFolders.add("\\server\\events");

        moduleSubfolders.add("alliance");
        moduleSubfolders.add("army");
        moduleSubfolders.add("capital");
        moduleSubfolders.add("castle");
        moduleSubfolders.add("celeb");
        moduleSubfolders.add("city");
        moduleSubfolders.add("colony");
        moduleSubfolders.add("commission");
        moduleSubfolders.add("common");
        moduleSubfolders.add("field");
        moduleSubfolders.add("fortifications");
        moduleSubfolders.add("friend");
        moduleSubfolders.add("furlough");
        moduleSubfolders.add("gamblingranking");
        moduleSubfolders.add("gamemaster");
        moduleSubfolders.add("gemstone");
        moduleSubfolders.add("hero");
        moduleSubfolders.add("interior");
        moduleSubfolders.add("mail");
        moduleSubfolders.add("npchero");
        moduleSubfolders.add("quest");
        moduleSubfolders.add("rank");
        moduleSubfolders.add("report");
        moduleSubfolders.add("shop");
        moduleSubfolders.add("tech");
        moduleSubfolders.add("trade");
        moduleSubfolders.add("troop");

        for(String str : moduleSubfolders) {
            inFolders.add(inputBase + module + str);
            outFolders.add(outputBase + module + str);
        }

        for(String str : otherFolders) {
            inFolders.add(inputBase + str);
            outFolders.add(outputBase + str);
        }

        for(String out : outFolders) {
            File f = new File(out);
            if(!f.exists()) {
                f.mkdir();
            }
        }

        for(int i = 0; i < inFolders.size(); i++) {
            parseMultibleFiles(inFolders.get(i), outFolders.get(i));
        }
    }

    public static void parseMultibleFiles(String inputFolder, String outputFolder) {
        EvonyBeanGenerator eax;
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
                eax = new EvonyBeanGenerator(currentFile);
                eax.setAlternateConfiguration(true);
                eax.parse();
                System.out.println("Saving: " + inputFolder + "\\" + file.getName());
                eax.saveJavaClass(outputFolder);
            }
        }
    }

//    public EvonyBeanGenerator() {
//        super();
//    }
    public EvonyBeanGenerator() {
        initialize();
    }

//    public EvonyBeanGenerator(ArrayList<String> wholeASClass) {
//        super(wholeASClass);
//    }
    public EvonyBeanGenerator(ArrayList<String> wholeASClass) {
        initialize();
        this.wholeASClass = wholeASClass;
    }

    @Override
    protected void initialize() {
        super.initialize();
        classImports.add("import evonyproxy.common.ASObjectable;");
        classImports.add("import flex.messaging.io.ArrayCollection;");
        initializeBeanNames();
    }

    private void initializeBeanNames() {
        beanNameList = new ArrayList<String>();
        beanNameList.add("AllProduceBean");
        beanNameList.add("AllianceAddPlayerByLeaderInfoBean");
        beanNameList.add("AllianceAddPlayerByUserInfoBean");
        beanNameList.add("AllianceAddPlayerInfoBean");
        beanNameList.add("AllianceEvent");
        beanNameList.add("AllianceQueryBean");
        beanNameList.add("ArmyBean");
        beanNameList.add("AvailableBuildingListBean");
        beanNameList.add("AvailableResearchListBean");
        beanNameList.add("BettleResultBean");
        beanNameList.add("BuffBean");
        beanNameList.add("BuildingBean");
        beanNameList.add("BuyResourceBean");
        beanNameList.add("CastleBean");
        beanNameList.add("CastleResourceBean");
        beanNameList.add("CastleSignInfoBean");
        beanNameList.add("ColonyBean");
        beanNameList.add("CommissionQuestArmyRankBean");
        beanNameList.add("CommissionQuestBean");
        beanNameList.add("ConditionBean");
        beanNameList.add("ConditionDependBuildingBean");
        beanNameList.add("ConditionDependItemBean");
        beanNameList.add("ConditionDependTechBean");
        beanNameList.add("EffortListBean");
        beanNameList.add("EquipmentBean");
        beanNameList.add("EquipmenttechBean");
        beanNameList.add("FieldBean");
        beanNameList.add("FortProduceListBean");
        beanNameList.add("FortificationBean");
        beanNameList.add("GamblingItemBean");
        beanNameList.add("GamblingRankingBean");
        beanNameList.add("GemStoneBean");
        beanNameList.add("GemStoneInPosBean");
        beanNameList.add("GemStoneLvInfroBean");
        beanNameList.add("HeroBean");
        beanNameList.add("IndexAllianceInfoBean");
        beanNameList.add("ItemBean");
        beanNameList.add("MailBean");
        beanNameList.add("MapCastleBean");
        beanNameList.add("MarketTradeBean");
        beanNameList.add("MilitarySituation");
        beanNameList.add("NpcHeroBean");
        beanNameList.add("PackageBean");
        beanNameList.add("PlayerBean");
        beanNameList.add("PlayerInfoBean");
        beanNameList.add("ProduceBean");
        beanNameList.add("QuestBean");
        beanNameList.add("QuestTargetBean");
        beanNameList.add("QuestTypeBean");
        beanNameList.add("RankAllianceBean");
        beanNameList.add("RankCastleBean");
        beanNameList.add("RankHeroBean");
        beanNameList.add("ReportBean");
        beanNameList.add("ResourceBean");
        beanNameList.add("ResourceInfoBean");
        beanNameList.add("ResourceProduceDataBean");
        beanNameList.add("SaleItemBean");
        beanNameList.add("SaleTypeBean");
        beanNameList.add("SetShowInfro");
        beanNameList.add("SimpleNpcHeroBean");
        beanNameList.add("StoreBean");
        beanNameList.add("TVmsgBean");
        beanNameList.add("TradeBean");
        beanNameList.add("TransingTradeBean");
        beanNameList.add("TroopBean");
        beanNameList.add("TroopConfigBean");
        beanNameList.add("TroopProduceListBean");
        beanNameList.add("TroopStrBean");
        beanNameList.add("UnitAlliance");
        beanNameList.add("ZoneInfoBean");
    }

    @Override
    public void parse() {
        while(globalCurrentLineNumber < wholeASClass.size() - 1) {
            nextCrntLine();
            if(!crntLine.equals("") && !crntLine.equals("{") && !crntLine.equals("}")) {
                analyzeLine();
            }
        }
        AreClassVarsNative();
        makeConstructorWithVar();
        makeConstructorWithoutParameter();
        makeCloneMethod();
        makeToASObjectMethod();
        makeGetterSetter();
        makeJavaClass();
    }

    @Override
    protected ArrayList<String> analyzeLine() {
        crntLine = crntLine.replaceAll(";", ""); // Need to modify so that it does not fuck with things inside quotes
        firstDivision = crntLine.split(" ");

        if(firstDivision[0].equals("package")) {
            handlePackage();
        }
        else {
            if(firstDivision[0].equals("import")) {
                handleImport();
            }
            else {
                if(firstDivision.length > 1) {
                    if(firstDivision[1].equals("class")) {
                        className = firstDivision[2];
                    }
                    else {
                        if(firstDivision[1].equals("static")) {
                            handleGlobalStaticVars();
                        }
                        else {
                            varOrFunction();
                        }
                    }
                }
            }
        }

        return null;
    }

    protected void handleGlobalStaticVars() {
        String staticVarLine = "";
        String[] tmpSplit = firstDivision[3].split(":");
        staticVarLine = firstDivision[0] + " " + firstDivision[1] + " final "
                + tmpSplit[1] + " " + tmpSplit[0] + " = "
                + firstDivision[firstDivision.length - 1] + ";";

        classStaticVars.add(staticVarLine);
    }

    protected void handlePackage() {
        String pkg = firstDivision[1];
        String[] impSplit = pkg.split("\\.");
        if(impSplit.length > 2) {
            if(impSplit[0].equals("com") && impSplit[1].equals("evony")) {
                pkg = "package evonyproxy.";
                for(int i = 2; i < impSplit.length; i++) {
                    pkg += impSplit[i];
                    if(i != impSplit.length - 1) {
                        pkg += ".";
                    }
                }
                pkg += ";";
                packageStr = pkg;
            }
            else {
                packageStr = crntLine + ";";
            }
        }
        else {
            packageStr = crntLine + ";";
        }
    }

    @Override
    protected void handleImport() {
        String imp = firstDivision[1];
        /* Added special case to block com.evony.common.* as it will be added regardless */
        if(!imp.equals("com.evony.common.*")) {
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
                        classImports.add(imp);
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
    }

    @Override
    protected void varOrFunction() {
        if(firstDivision[varOrFunctionIndex].equals("var")) {
            handleVar();
        }
        else {
            if(firstDivision[varOrFunctionIndex].equals("function")) {
                if(firstDivision[varOrFunctionIndex + 1].contains(className)
                        && arrayNameList.size() > 0) {
                    try {
                        handleConstructor();
                    } catch(Error e) {
                        System.out.println(e.getMessage() + "\nKilling program.");
                        System.exit(1);
                    }
                }
                else {
                    handleFunction();
                }
            }
        }
    }

    protected void handleConstructor() throws Error {
        ArrayList<String> constructor = new ArrayList<String>();
        String constLine = "";
        /* Seperates the cunstructor into its on var */
        do {
            nextCrntLine();
            constructor.add(crntLine);
        } while(!crntLine.contains("end function"));

        while(!arrayNameList.isEmpty()) {
            String arrName = arrayNameList.pop();
            arrName = arrName.substring(0, arrName.length() - 5);
            int i = 0;
            int nameFoundCount = 0;

            while(nameFoundCount < 3 && i < constructor.size() - 1) {
                constLine = constructor.get(++i);
                if(constLine.contains(arrName) && !constLine.contains(arrName + "Array")) {
                    nameFoundCount++;
                }

            }

            if(nameFoundCount != 3) {
                throw new Error("Failed to find third instance of "
                        + arrName + " in " + className);
            }

            try {
                handleConstructorFindProperBean(arrName, constLine);
            } catch(Error e) {
                System.out.println(e.getMessage() + "\nKilling program.");
                System.exit(1);
            }
        }
    }

    private void handleConstructorFindProperBean(String arrayName, String constLine) throws Error {
        Boolean foundBean = false;

        for(String beanName : beanNameList) {
            if(constLine.contains(beanName)) {
                arrayBeanMap.put(arrayName, beanName);
                foundBean = true;
                break;
            }
        }

        if(!foundBean) {
            throw new Error("Failed to find " + arrayName
                    + "'s corrosponding bean"
                    + " in " + className + "\nconstLine: " + constLine);
        }
    }

    @Override
    protected void handleVar() {
        String javaVarLine = "";
        /* secondDivision[0] is variable name, [1] var type */
        String[] secondDivision = firstDivision[2].split(":");
        secondDivision[0] = handleUidInVarName(secondDivision[0]);
        if(secondDivision[1].equals("int")) {
            secondDivision[1] = "Integer";
        }
        else {
            if(secondDivision[1].equals("ArrayCollection")) {
                secondDivision[1] = "ArrayList";
                arrayNameList.add(secondDivision[0]);
                /* Removes "Array" from Array var names because not used in key */
                secondDivision[0] = (secondDivision[0].split("Array"))[0];
            }
            else {
                if(secondDivision[1].equals("Number")) {
                    secondDivision[1] = "Double";
                }
            }
        }

        /* Prevents EventDispatcher object from being copied over because i dont know what to do with it yet */
        if(secondDivision[1].equals("EventDispatcher")) {
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

    private String handleUidInVarName(String varName) {
        String[] splitUid = varName.split("[0-9]");
        /* Removes numbers then adds the last character back if a num */
        String ret = splitUid[splitUid.length - 1];
        if((varName.substring(varName.length() - 1, varName.length())).matches("[0-9]")) {
            ret += varName.substring(varName.length() - 1, varName.length());
        }

        return ret;
    }

    protected void makeConstructorWithVar() {
        ArrayList<String> meth = new ArrayList<String>();
        String tmpStr = "";

        /* Forcing public methods for now */
        tmpStr += "public" + " ";

        tmpStr += className + "(ASObject aso)" + " {";
        meth.add(tmpStr);

        /* Instantiate all ArrayList(s) as 'new ArrayList<beanType>();' */
        for(String var : classVars) {
            String[] spliVar = var.split(" ");
            if(spliVar[1].equals("ArrayList")) {
                tmpStr = spliVar[2] + " = new ArrayList<";
                tmpStr += arrayBeanMap.get(spliVar[2]);
                tmpStr += ">();";
                meth.add(tmpStr);
            }
        }
        meth.add("");

        String crntVar;
        String[] spliVarLine;
        for(int i = 0; i < classVars.size(); i++) {
            spliVarLine = classVars.get(i).split(" ");
            crntVar = spliVarLine[2];

            meth.add("if(" + "aso.get(\"" + crntVar + "\")" + " != null) {");
            /* Special case for ArrayCollection type */
            if(spliVarLine[1].equals("ArrayList")) {
                tmpStr = "Object[] objArr = ";
                tmpStr += "(Object[]) ";
                tmpStr += "aso.get(\"" + crntVar + "\");";
                meth.add(tmpStr);

                meth.add("for(int j = 0; j < objArr.length; j++) {");
                tmpStr = crntVar + ".add(new ";
                tmpStr += arrayBeanMap.get(crntVar);
                tmpStr += "((ASObject) objArr[j]));";
                meth.add(tmpStr);
                meth.add("}");
//                meth.add("this." + crntVar + " = " + "new " + spliVarLine[1]
//                        + "((Collection) aso.get(\"" + crntVar + "\"));");
            }
            else {
                if(classVarsAreNative.get(i).booleanValue()) { /* if is native */
                    meth.add("this." + crntVar + " = (" + spliVarLine[1] + ") aso.get(\"" + crntVar + "\");");
                }
                else {
                    meth.add("this." + crntVar + " = " + "new " + spliVarLine[1]
                            + "((ASObject) aso.get(\"" + crntVar + "\"));");
                }
            }
            meth.add("}");
            meth.add("");
        }
        meth.remove(meth.size() - 1);
        meth.add("}");

        classMethods.add(meth);
    }

    protected void makeConstructorWithoutParameter() {
        ArrayList<String> meth = new ArrayList<String>();
        String tmpStr = "";

        /* Forcing public methods for now */
        tmpStr += "public" + " ";

        tmpStr += className + "()" + " {";
        meth.add(tmpStr);
        meth.add("}");

        classMethods.add(meth);
    }

    private void AreClassVarsNative() {
        String varType;
        for(int i = 0; i < classVars.size(); i++) {
            varType = classVars.get(i).split(" ")[1];
            if(!varType.equals("Integer") && !varType.equals("Boolean") && !varType.equals("Double")
                    && !varType.equals("Float") && !varType.equals("String")
                    && !varType.equals("ArrayList") && !varType.equals("Long")
                    && !varType.equals("Short")) {
                classVarsAreNative.add(i, false);
            }
            else {
                classVarsAreNative.add(i, true);
            }
        }
    }

    protected void makeCloneMethod() {
        ArrayList<String> meth = new ArrayList<String>();
        String tmpStr = "";

        meth.add("@Override");
        tmpStr = "public" + " ";
        tmpStr += className + " clone()" + " {";
        meth.add(tmpStr);

        meth.add(className + " clone = new " + className + "();");
        meth.add("");

        String crntVar;
        String[] spliVarLine;
        for(int i = 0; i < classVars.size(); i++) {
            spliVarLine = classVars.get(i).split(" ");
            crntVar = spliVarLine[2];

            meth.add("if(" + "this." + crntVar + " != null) {");

            if(spliVarLine[1].equals("ArrayList")) {
                tmpStr = "ArrayList tmpArrLst = new ArrayList<";
                tmpStr += arrayBeanMap.get(crntVar);
                tmpStr += ">();";
                meth.add(tmpStr);
                meth.add("");

                tmpStr = "for(";
                tmpStr += "Object" + " bean : ";
                tmpStr += crntVar + ") {";
                meth.add(tmpStr);

                meth.add(arrayBeanMap.get(crntVar) + " tmpBean = (" + arrayBeanMap.get(crntVar) + ") bean;");
                meth.add("tmpArrLst.add(tmpBean.clone());");
                meth.add("}");

                meth.add("clone.set" + getPartGetSetMethName(crntVar) + "(tmpArrLst);");
            }
            else {
                if(classVarsAreNative.get(i).booleanValue()) { /* if is native */
//                meth.add("clone." + crntVar + " = " + "this." + crntVar + ";");
                    meth.add("clone.set" + getPartGetSetMethName(crntVar) + "(" + "this." + crntVar + ");");
                }
                else {
//                meth.add("clone." + crntVar + " = " + "this." + crntVar + ".clone();");
                    meth.add("clone.set" + getPartGetSetMethName(crntVar) + "(" + "this." + crntVar + ");");
                }
            }
            meth.add("}");
            meth.add("");
        }
        meth.add("return clone;");
        meth.add("}");

        classMethods.add(meth);
    }

    protected void makeToASObjectMethod() {
        ArrayList<String> meth = new ArrayList<String>();
        String tmpStr = "";

        tmpStr += "public" + " ";
        tmpStr += "ASObject " + "toASObject()" + " {";
        meth.add(tmpStr);

        meth.add("ASObject" + " aso = new ASObject();");
        meth.add("");

        String crntVar;
        String[] spliVarLine;
        for(int i = 0; i < classVars.size(); i++) {
            spliVarLine = classVars.get(i).split(" ");
            crntVar = spliVarLine[2];

            meth.add("if(" + "this." + crntVar + " != null) {");

            if(spliVarLine[1].equals("ArrayList")) {
                meth.add("ArrayList al = new ArrayList();");
                meth.add("for(Object obj : " + spliVarLine[2] + ") {");
                meth.add("ASObjectable as = (ASObjectable) obj;");
                meth.add("al.add(as.toASObject());");
                meth.add("}");
                meth.add("aso.put(\"" + crntVar + "\", al);");
            }
            else {
                if(classVarsAreNative.get(i).booleanValue()) { /* if is native */
                    meth.add("aso.put(\"" + crntVar + "\", " + crntVar + ");");
                }
                else {
                    meth.add("aso.put(\"" + crntVar + "\", " + crntVar + ".toASObject());");
                }
            }

            meth.add("}");
            meth.add("");
        }
        meth.add("return aso;");
        meth.add("}");

        classMethods.add(meth);
    }

    protected void makeGetterSetter() {
        ArrayList<String> getMeth;
        ArrayList<String> setMeth;
        String[] spliVar;
        String capVar;
        String tmpStr = "";

        for(int i = 0; i < classVars.size(); i++) {
            getMeth = new ArrayList<String>();
            setMeth = new ArrayList<String>();
            spliVar = classVars.get(i).split(" ");
            capVar = getPartGetSetMethName(spliVar[2]);

            /* Make Getter */
            tmpStr = "public" + " ";
            tmpStr += spliVar[1] + " get" + capVar + "() {";
            getMeth.add(tmpStr);
            tmpStr = "";
            tmpStr += "return " + spliVar[2] + ";";
            getMeth.add(tmpStr);
            getMeth.add("}");
            classMethods.add(getMeth);

            /* Make Setter */
            tmpStr = "public void ";
            tmpStr += "set" + capVar + "(" + spliVar[1] + " " + spliVar[2] + ") {";
            setMeth.add(tmpStr);
            tmpStr = "this.";
            tmpStr += spliVar[2] + " = " + spliVar[2] + ";";
            setMeth.add(tmpStr);
            setMeth.add("}");
            classMethods.add(setMeth);
        }
    }

    protected String getPartGetSetMethName(String concernedVar) {
        return (concernedVar.substring(0, 1)).toUpperCase() + concernedVar.substring(1, concernedVar.length());
    }

    @Override
    protected void makeJavaClass() {
        javaClass = new ArrayList<String>();
        String tmpStr = "";

        javaClass.add(packageStr);
        javaClass.add("");

//        javaClass.add("import flex.messaging.io.amf.ASObject;");
        for(String imp : classImports) {
            javaClass.add(imp);
        }
        javaClass.add("");

        javaClass = (ArrayList<String>) makeJavaClassDoc(javaClass);

        tmpStr = "public class ";
        tmpStr += className + " implements ASObjectable" + " {";
        javaClass.add(tmpStr);

        for(String statVar : classStaticVars) {
            javaClass.add(statVar);
        }

        for(String var : classVars) {
            String tmpVar = "";

            /* Adds a type to ArrayList vars */
            String[] spliVar = var.split(" ");

            if(spliVar[1].equals("ArrayList")) {
                spliVar[1] = spliVar[1] + "<" + arrayBeanMap.get(spliVar[2]) + ">";
                for(int i = 0; i < spliVar.length; i++) {
                    String str = spliVar[i];
                    tmpVar += str;
                    if(i != spliVar.length - 1) {
                        tmpVar += " ";
                    }
                }
                javaClass.add(tmpVar);
            } else {
                javaClass.add(var);
            }
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

    @Override
    protected void handleFunction() {
        while(!crntLine.contains("end function")) {
            nextCrntLine();
        }
    }
}
