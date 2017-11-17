package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] list2 = new int[10];
        int temp = 0;
        for (int i = 0; i < list2.length; i++){
            list2[list2.length - 1 - i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < list2.length; i++)
            System.out.println(list2[i]);

    }
}
