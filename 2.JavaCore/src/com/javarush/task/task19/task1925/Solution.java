package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sb = new StringBuilder();
        while (file1.ready()) {
            String[] str = file1.readLine().split( " ");
            for (String aStr : str) {
                if (aStr.length() > 6) {
                    sb.append(aStr).append(",");
                }
            }
        }
        file2.write(sb.delete(sb.length() - 1, sb.length()).toString());
        file1.close();
        file2.close();
    }
}
