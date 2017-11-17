package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> list = new HashMap<>();
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        while (inputStream.available() > 0) {
            int bit = inputStream.read();
            if (list.containsKey(bit))
                list.put(bit, list.get(bit) + 1);
            else
                list.put(bit, 1);
        }
        inputStream.close();
        int min = Integer.MAX_VALUE;
        for (HashMap.Entry<Integer, Integer> y : list.entrySet())
            if (y.getValue() < min)
                min = y.getValue();
        for (HashMap.Entry<Integer, Integer> x : list.entrySet())
            if (x.getValue() == min)
                System.out.print(x.getKey() + " ");

    }
}
