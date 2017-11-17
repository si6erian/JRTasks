package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код

        char[] chars = s.toCharArray();
        List<Character> listC = new ArrayList<Character>();
        for (char c : chars) {
            listC.add(c);
        }
        for (int i = 0; i < 40; i++)
        {
            if (listC.isEmpty()) break;
            for (char listD : listC)
            {
                System.out.print(listD);
            }
            System.out.println();
            listC.remove(0);
        }

    }

}
