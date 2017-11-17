package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        HashMap<Integer, Integer> list = new HashMap<>();
        filename = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(filename);
        while (inputStream.available() > 0) {
            int bit = inputStream.read();
            if (list.containsKey(bit))
                list.put(bit, list.get(bit) + 1);
            else
                list.put(bit, 1);
        }
        inputStream.close();
        int max = 0;
        for (HashMap.Entry<Integer, Integer> y : list.entrySet())
            if (y.getValue() > max)
                max = y.getValue();
        for (HashMap.Entry<Integer, Integer> x : list.entrySet())
            if (x.getValue() == max)
                System.out.print(x.getKey() + " ");
    }
}