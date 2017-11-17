package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream inputStream = new FileInputStream(args[0]);
        int counter = 0;
        while (inputStream.available() > 0) {
            int i = inputStream.read();
            if ((64 < i && i < 91) || (96 < i && i < 123))
                counter++;
        }
        System.out.println(counter);
        inputStream.close();
    }
}
