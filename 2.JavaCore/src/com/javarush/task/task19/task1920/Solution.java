package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map1 = new TreeMap<>();
        Map<Double, String> map2 = new TreeMap<>();
        while (file.ready()) {
            String[] s = file.readLine().split(" ");
            if (map1.containsKey(s[0])) {
                map1.put(s[0],map1.get(s[0]) + Double.parseDouble(s[1]));
            } else {
                map1.put(s[0],Double.parseDouble(s[1]));
            }
        }
        file.close();
        for (Map.Entry<String,Double> pair : map1.entrySet()) {
            if (map2.containsKey(pair.getValue())) {
                map2.put(pair.getValue(), map2.get(pair.getValue()) + " " + pair.getKey());
            } else {
                map2.put(pair.getValue(),pair.getKey());
            }
        }
        ArrayList<String> array = new ArrayList<>();
        for (Map.Entry<Double, String> pair : map2.entrySet()) {
            array.add(pair.getValue());
        }
        System.out.println(array.get(array.size() - 1 ));

    }
}
