package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        while (file1.ready()) {
            String[] mass = file1.readLine().split("\\s");
            for (String s : mass) {
                try {
                    Integer.parseInt(s);
                    file2.write(s + " ");
                } catch (NumberFormatException e) {
                }
            }
        }
        file1.close();
        file2.close();
    }
}
