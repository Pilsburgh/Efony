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
public class StaticsExtractor {

    public static void main(String[] args) {
        String folder = "c:\\astojava";
        String inFileName = "test.as";
        String outFileName = "Test.java";

        ArrayList<String> strArray = readFile(folder, inFileName);
        strArray = toJava(strArray);

//        String[] fName = outFileName.split('.');

        strArray = makeClass("Test", strArray);
        
        writeFile(strArray, folder, outFileName);
    }

    public static ArrayList<String> readFile(String folder, String inFileName) {
        if((String.valueOf(folder.charAt(folder.length() - 1))).equals("\\")) {
            folder = folder.substring(0, folder.length() - 1);
        }

        try {
//            System.out.println("\nreadFile:");
            FileInputStream in = new FileInputStream(new File(folder + "\\" + inFileName));
            Scanner scan = new Scanner(in);
            ArrayList<String> strArray = new ArrayList();
            String temp;

            while (scan.hasNext()) {
                temp = scan.nextLine();
                strArray.add(temp);
//                System.out.println(temp);
            }
            return strArray;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
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

    public static void writeFile(ArrayList<String> strArray, String folder, String outFileName) {
        if((String.valueOf(folder.charAt(folder.length() - 1))).equals("\\")) {
            folder = folder.substring(0, folder.length() - 1);
        }

//        System.out.println("\nwriteFile:");
        try {
            File outFile = new File(folder + "\\" + outFileName);
            outFile.createNewFile();
            FileOutputStream out = new FileOutputStream(outFile);
            PrintWriter pw = new PrintWriter(out);
            for (String str : strArray) {
                pw.println(str);
//                System.out.println(str);
            }
            pw.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Output file not found");
        } catch (IOException e) {
            System.out.println("Output IOException");
        }
    }
}
