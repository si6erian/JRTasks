package com.javarush.task.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader myfile;
        while (true){
            try{
                myfile = new BufferedReader ( new FileReader(reader.readLine()));
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (myfile.ready())
        {
            int data = Integer.parseInt(myfile.readLine());
            if (data % 2 == 0 ) list.add(data);
        }

        sort(list);

        for (Integer x : list)
        {
            System.out.println(x);
        }
        reader.close();
        myfile.close();
    }

    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
    }
}
