package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Solution {
    public static Map<Integer, String> resultMap = new TreeMap<>();
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        String tempname = "";
        while (!(filename = reader.readLine()).equals("end")) {
            tempname = filename.split(Pattern.quote(".part"))[0];
            Thread rt = new ReadThread(filename);
            rt.start();
        }
        reader.close();

        if (!resultMap.isEmpty()) {
            File newfile = new File(tempname);
            if (!newfile.exists()) {
                try {
                    newfile.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            FileOutputStream outputStream = new FileOutputStream(tempname, true);
            for (int y : resultMap.keySet()) {
                FileInputStream inputStream1 = new FileInputStream(resultMap.get(y));
                byte[] buffer = new byte[inputStream1.available()];
                while (inputStream1.available() > 0) {
                    int count = inputStream1.read(buffer);
                    outputStream.write(buffer, 0, count);
                }
                inputStream1.close();
            }
            outputStream.close();
        }
    }
    public static class ReadThread extends Thread {
        private String filename;

        public ReadThread(String name) {
            this.filename = name;
        }

        @Override
        public void run() {
            String[] str = filename.split(Pattern.quote(".part"));

            int number = Integer.parseInt(str[1]);
            synchronized (resultMap) {
                resultMap.put(number, filename);
            }
        }
    }
}