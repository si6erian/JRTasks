package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        ArrayList<String> list = new ArrayList<>();

        while (file.ready()) {
            list.add(file.readLine());
        }
        file.close();

        int counter = 0;
        for (String s: list) {
            String[] word = s.split(" ");
            for (String tr: word){
                for (String x: words){
                    if (tr.equals(x)) {
                        counter++;
                    }
                }
            }
            if (counter == 2) {
                System.out.println(s);
            }
            counter = 0;
        }
    }
}
