package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file2);
        int fc = fileInputStream.available();
        byte[] buffer1 = new byte[fc];
        byte[] buffer2 = new byte[fc];
        while (fileInputStream.available() > 0) {
            fileInputStream.read(buffer1);
        }
        for (int i = buffer1.length-1; i >= 0; i--)
            buffer2[i] = buffer1[buffer1.length-1-i];
        fileOutputStream1.write(buffer2,0,fc);
        reader.close();
        fileInputStream.close();
        fileOutputStream1.close();
    }
}
