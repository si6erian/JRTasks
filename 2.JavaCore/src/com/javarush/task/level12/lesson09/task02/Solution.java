package com.javarush.task.level12.lesson09.task02;

/* Интерфейсы Fly, Run, Swim
Напиши public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавить в каждый интерфейс по одному методу.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

//add interfaces here - добавь интерфейсы тут
    interface Fly{
        int Speed(int s);
    }
    interface Run{
        int Distance(int d);
    }
    interface Swim{
        String Style(String stylename);
    }

}
