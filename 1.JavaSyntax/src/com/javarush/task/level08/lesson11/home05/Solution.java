package com.javarush.test.level08.lesson11.home05;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(s," ",true);
        while (st.hasMoreTokens())
            list1.add(st.nextToken());
        for (String str : list1){
            char[] chars = str.toCharArray();
            String result = "";
            result += Character.toTitleCase(chars[0]);
            for (int i = 1; i < chars.length; i++)
                result += chars[i];
            list2.add(result);
        }
        for (String str2 : list2) System.out.print(str2);
    }
}
