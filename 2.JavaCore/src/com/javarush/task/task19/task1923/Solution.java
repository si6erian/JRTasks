package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));

        while (file1.ready()) {
            String[] str = file1.readLine().split( " ");
            for (String s: str) {
                if (!s.matches("^\\D*$")){
                    file2.write(s + " ");
                }
            }
        }
        file1.close();
        file2.close();
    }
}
