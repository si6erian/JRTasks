package com.javarush.test.level04.lesson13.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int a = 1, b = 1;
        for (; true; ) {
            System.out.print("8");
            if (a > 9) {
                System.out.println();
                break;
            }
            a++;
        }
        for (; true; ) {
            System.out.println("8");
            if (b > 9)
                break;
            b++;
            }

    }
}
