package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int size = 5;
        int step = size / 2;
        int[] list = new int[size];
        for (int i = 0; i < size; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        while (step > 0){
            for (int i = 0; i < (size - step); i++){
                int j = i;
                while (j >= 0 && list[j] > list[j + step]){
                    int temp = list[j];
                    list[j] = list[j + step];
                    list[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }
}
