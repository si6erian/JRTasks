package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream inputStream1 = new FileInputStream(args[0]);
        TreeMap<Integer, Integer> sorted_map = new TreeMap<>();

        while (inputStream1.available() > 0) {
            int k = inputStream1.read();
            if (sorted_map.containsKey(k))
                sorted_map.put(k,sorted_map.get(k) + 1);
            else
                sorted_map.put(k,1);
        }
        inputStream1.close();
        
        for (int x : sorted_map.keySet()) {
            System.out.println((char)x + " " + sorted_map.get(x));
        }
    }
}