package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();
        while (file.ready()) {
            String[] s = file.readLine().split(" ");
            if (map.containsKey(s[0])) {
                map.put(s[0],map.get(s[0]) + Double.parseDouble(s[1]));
            } else {
                map.put(s[0],Double.parseDouble(s[1]));
            }
        }
        file.close();
         for (Map.Entry<String,Double> pair : map.entrySet()) {
             System.out.println(pair.getKey() + " " + pair.getValue());
         }
    }
}
