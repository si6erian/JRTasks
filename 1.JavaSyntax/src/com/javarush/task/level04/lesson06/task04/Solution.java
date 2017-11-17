package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Name1 = reader.readLine();
        String Name2 = reader.readLine();
        if (Name1.equals(Name2))
            System.out.println("Имена идентичны");
        else
            if (Name1.length() == Name2.length())
                System.out.println("Длины имен равны");


    }
}
