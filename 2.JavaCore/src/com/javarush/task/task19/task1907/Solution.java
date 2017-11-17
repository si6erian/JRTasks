package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(file.readLine()));
        file.close();
        int counter = 0;
        while (reader.ready()) {
            String[] words = reader.readLine().split("\\W");
            for (String s : words) {
                if (s.equals("world")) {
                    counter++;
                }
            }

        }
        reader.close();
        System.out.println(counter);
    }
}
