package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String file = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(file);
            int count = fileInputStream.available();
            if (count < 1000) {
                reader.close();
                fileInputStream.close();
                throw new DownloadException();
            }
            fileInputStream.close();
        }
    }

    public static class DownloadException extends Exception {

    }
}
