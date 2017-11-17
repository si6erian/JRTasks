package com.javarush.task.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        for (int i = 0; i < 5; i++) {
            labels.put(i+0.1,"hi");
        }

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
