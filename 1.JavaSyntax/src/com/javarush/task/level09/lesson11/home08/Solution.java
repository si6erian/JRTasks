package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> list2 = new ArrayList<int[]>();
        list2.add(new int[5]);
        list2.add(new int[2]);
        list2.add(new int[4]);
        list2.add(new int[7]);
        list2.add(new int[0]);

        for (int[] array : list2){
            for (int i = 0; i <= array.length-1; i++){
                array[i] = i;
            }
        }
        return list2;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
