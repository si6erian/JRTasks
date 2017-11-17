package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        while (inputStream.available() > 0) {
            int bit = inputStream.read();
            if (!arrayList.contains(bit))
                arrayList.add(bit);
        }
        inputStream.close();
        for (int x : sort(arrayList))
            System.out.print(x + " ");
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> array){
        int size = array.size();
        for(int step = size / 2; step > 0; step /= 2) {
            for(int i = 0; i < size - step; ++i) {
                for(int j = i; j >= 0 && array.get(j) > array.get(j + step); --j) {
                    int temp = array.get(j);
                    array.set(j,array.get(j + step));
                    array.set(j + step,temp);
                }
            }
        }
        return array;
    }
}
