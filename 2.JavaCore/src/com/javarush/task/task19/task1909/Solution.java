package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        while (file1.ready()) {
            file2.write(file1.readLine().replaceAll("\\.","!"));
            file2.newLine();
        }
        file1.close();
        file2.close();
    }
}
