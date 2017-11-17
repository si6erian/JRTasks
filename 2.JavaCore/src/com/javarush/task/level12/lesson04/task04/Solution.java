package com.javarush.task.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //Напишите тут ваши методы
    public static int min(int x, int y){ return x < y ? x : y ; }
    public static long min(long x, long y){ return x < y ? x : y ; }
    public static double min(double x, double y){ return x < y ? x : y ; }
}
