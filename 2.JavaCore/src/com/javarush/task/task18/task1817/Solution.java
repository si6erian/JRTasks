package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream inputStream = new FileInputStream(args[0]);
        int counter_space = 0;
        int counter = 0;
        while (inputStream.available() > 0) {
            int i = inputStream.read();
            if (i == 32)
                counter_space++;
            counter++;
        }
        System.out.println(String.format(Locale.US,"%.2f",(float)counter_space/counter*100));
        inputStream.close();

    }
}
