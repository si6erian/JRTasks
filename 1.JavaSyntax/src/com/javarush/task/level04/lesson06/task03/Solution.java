package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if ((a > b)&&(a > c))
            if (b > c)
                System.out.println(a + " " + b + " " + c);
            else
                System.out.println(a + " " + c + " " + b);
        if ((b > a)&&(b > c))
            if (a > c)
                System.out.println(b + " " + a + " " + c);
            else
                System.out.println(b + " " + c + " " + a);
        if ((c > a)&&(c > b))
            if (a > b)
                System.out.println(c + " " + a + " " + b);
            else
                System.out.println(c + " " + b + " " + a);
    }

}
