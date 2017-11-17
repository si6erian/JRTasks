package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        while (!(filename = reader.readLine()).equals("exit")) {
            Thread rt = new ReadThread(filename);
            rt.start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) {
            //implement constructor body
            this.filename = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        private String filename;

        @Override
        public void run(){
            try {
                int[] bytes = new int[255];
                FileInputStream inputStream1 = new FileInputStream(filename);
                while (inputStream1.available() > 0)
                    bytes[inputStream1.read()]++;
                inputStream1.close();
                int max = 0;
                int index = 0;
                for (int i = 0; i < bytes.length -1; i++) {
                    if (bytes[i] > max) {
                        max = bytes[i];
                        index = i;
                    }
                }
                synchronized (resultMap) {
                    resultMap.put(filename,index);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}