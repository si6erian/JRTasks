package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(file.readLine());
        FileWriter writer = new FileWriter(file.readLine());
        file.close();
        int counter = 1;
        while (reader.ready()) {
            int data = reader.read();
            if ((counter % 2) == 0) {
                writer.write(data);
            }
            counter++;
        }
        reader.close();
        writer.close();
    }
}
