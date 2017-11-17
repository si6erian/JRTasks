package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        BufferedReader fin = new BufferedReader(new FileReader(file1));
        reader.close();
        String line;
        while ((line = fin.readLine()) != null) {
            String[] words = line.split(" ");
            if (Integer.parseInt(words[0]) == Integer.parseInt(args[0])) {
                System.out.println(line);
            }
        }
        fin.close();
    }
}
