package com.javarush.task.task18.task1826;

/* 
Шифровка
*/


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[1]);
        File file = new File(args[2]);
        if (!file.exists())
            file.createNewFile();
        FileOutputStream outputStream = new FileOutputStream(args[2]);

        if (args.length == 3) {
            switch (args[0]) {
                case "-e":
                    while (inputStream.available() > 0) {
                        int data = inputStream.read();
                        outputStream.write(encode(data,1));
                    }
                    break;
                case "-d":
                    while (inputStream.available() > 0) {
                        int data = inputStream.read();
                        outputStream.write(encode(data,1));
                    }
                    break;
            }
            inputStream.close();
            outputStream.close();
        }
    }

    public static int encode(int data, int key) {
        return data ^ key;
    }
}