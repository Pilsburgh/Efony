/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.floatfrog.asjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @version .01
 * @author Michael Archibald
 */
public class EvonyStaticResponseGenerator {

    public static void mainSingleFile(String[] args) {
        String folder = "c:\\astojava";
        String inFileName = "test.as";
        String outFileName = "Test.java";

        ArrayList<String> strArray = Util.readFile(folder, inFileName);
        strArray = toJava(strArray);

//        String[] fName = outFileName.split('.');

        strArray = makeClass("Test", strArray);
        
        Util.writeFile(strArray, folder, outFileName);
    }

    public static void mainMultibleFiles(String[] args) {
        String outFolderStr = "c:\\astojava";
        File folder = new File(outFolderStr + "\\");
        ArrayList<String> inFileNames = new ArrayList();
        ArrayList<String> outFileNames = new ArrayList();

        for (String str : folder.list()) {
            inFileNames.add(str);
        }
        for (String str : inFileNames) {
            String[] temp = new String[2];

            outFileNames.add(str + ".java");
        }

        String inStr, outStr;
        for (int i = 0; i < inFileNames.size(); i++) {
            inStr = inFileNames.get(i);
            outStr = outFileNames.get(i);

            ArrayList<String> strArray = Util.readFile(outFolderStr, inStr);
            strArray = EvonyStaticResponseGenerator.toJava(strArray);
            Util.writeFile(strArray, outFolderStr, outStr);
        }
    }

    public static ArrayList<String> makeClass(String className, ArrayList<String> contents) {
        ArrayList<String> ret = new ArrayList<String>();
        ret.add("public interface " + className + " {");
        for (String str : contents) {
            ret.add("\t" + str);
        }
        ret.add("}");
        return ret;
    }

    public static ArrayList<String> toJava(ArrayList<String> strArray) {
        System.out.println("\ntoJava:");
        ArrayList<String> strReturn = new ArrayList();
        String[] whole, part;
        String temp;
        for (String str : strArray) {
            temp = "public static final ";
            whole = str.split(" ");
            part = whole[3].split(":");
            temp += part[1] + " " + part[0] + " = " + whole[5];

            for (String string : makeJavadoc(whole[5])) {
                strReturn.add(string);
            }

            strReturn.add(temp);
            strReturn.add("");
//            System.out.println(temp);
        }
        for (String string : strReturn) {
            System.out.println(string);
        }
        return strReturn;
    }

    public static ArrayList<String> makeJavadoc(String value) {
        final String openJdoc = "/**";
        final String midJdoc = "* ";
        final String closeJdoc = "*/";

        ArrayList<String> jdocRet = new ArrayList<String>();

        if (value.charAt(value.length() - 1) == ';') {
            value = value.substring(0, value.length() - 1);
        }
        jdocRet.add(openJdoc);
        jdocRet.add(midJdoc + value);
        jdocRet.add(closeJdoc);

        return jdocRet;
    }
}
