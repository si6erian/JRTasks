package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String in = reader.readLine();
        String out1 = reader.readLine();
        String out2 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(in);
        FileOutputStream fileOutputStream1 = new FileOutputStream(out1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(out2);
        int fc = fileInputStream.available();
        byte[] buffer1 = new byte[fc / 2 + fc % 2];
        byte[] buffer2 = new byte[fc - buffer1.length];
        while (fileInputStream.available() > 0) {
            int count1 = fileInputStream.read(buffer1);
            fileOutputStream1.write(buffer1, 0, count1);
            int count2 = fileInputStream.read(buffer2);
            fileOutputStream2.write(buffer2, 0, count2);
        }
        reader.close();
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}