package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader inputStream1 = new BufferedReader(new FileReader(file1));
        BufferedWriter outputStream2 = new BufferedWriter(new FileWriter(file2));
        String[] list = inputStream1.readLine().split(" ");
        for (int i = 0; i < list.length; i++)
            outputStream2.write(String.valueOf(Math.round(Double.parseDouble(list[i])))+ " ");
        inputStream1.close();
        outputStream2.close();
    }
}
