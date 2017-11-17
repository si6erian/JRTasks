package com.javarush.task.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Integer a = 1000;
        int b = 1000;
        System.out.println(print(a)==print(b));

    }

    //Напишите тут ваши методы
    public static Integer print(Integer a) { return a; }
    public static int print(int a) { return a; }
}
