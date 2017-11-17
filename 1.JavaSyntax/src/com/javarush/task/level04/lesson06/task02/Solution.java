package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        int d = Integer.parseInt(reader.readLine());
        //int ab = maxn(a,b);
        //int cd = maxn(c, d);
        System.out.println(maxn(maxn(a,b),maxn(c, d)));
    }
    public static int maxn(int x,int y){
        if (x > y)
            return x;
        else
            if (x == y)
                return x;
            else
                return y;
    }
}
