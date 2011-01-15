/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.floatfrog.asjava;

import java.io.File;
import java.util.ArrayList;

/**
 * @version .01
 * @author Michael Archibald
 */
public class Main {

    public static void main(String[] args) {
        String folderStr = "c:\\astojava";
        File folder = new File(folderStr + "\\");
        ArrayList<String> inFileNames = new ArrayList();
        ArrayList<String> outFileNames = new ArrayList();

        for (String str : folder.list()) {
            inFileNames.add(str);
        }
        for (String str : inFileNames) {
            outFileNames.add(str + ".java");
        }

        String inStr, outStr;
        for (int i = 0; i < inFileNames.size(); i++) {
            inStr = inFileNames.get(i);
            outStr = outFileNames.get(i);

            ArrayList<String> strArray = StaticsExtractor.readFile(folderStr, inStr);
            strArray = StaticsExtractor.toJava(strArray);
            StaticsExtractor.writeFile(strArray, folderStr, outStr);
        }
    }

}
