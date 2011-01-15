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
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version .01
 * @author Michael Archibald
 */
public class Util {
    public static ArrayList<String> readFile(String folder, String inFileName) {
        if((String.valueOf(folder.charAt(folder.length() - 1))).equals("\\")) {
            folder = folder.substring(0, folder.length() - 1);
        }

        try {
            FileInputStream in = new FileInputStream(new File(folder + "\\" + inFileName));
            Scanner scan = new Scanner(in);
            ArrayList<String> strArray = new ArrayList();
            String temp;

            while(scan.hasNext()) {
                temp = scan.nextLine();
                strArray.add(temp);
            }
            return strArray;
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        return null;
    }

    public static void writeFile(ArrayList<String> strArray, String folder, String outFileName) {
        if((String.valueOf(folder.charAt(folder.length() - 1))).equals("\\")) {
            folder = folder.substring(0, folder.length() - 1);
        }

        try {
            File outFile = new File(folder + "\\" + outFileName);
            outFile.createNewFile();
            FileOutputStream out = new FileOutputStream(outFile);
            PrintWriter pw = new PrintWriter(out);
            for (String str : strArray) {
                pw.println(str);
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
