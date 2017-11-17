package com.javarush.task.level14.lesson08.bonus01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try
        {
            int a = Integer.parseInt("a");
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int num[]={1,2,3,4};
            num[5]=5;
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            List list = null;
            list.add(1);
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object b[] = new String[10];
            b[1] = 5;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] c = new int[-1];

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            Object o = new String();
            System.out.println((Integer) o);
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String s = "12345";
            char c = s.charAt(6);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            List<String> original = new LinkedList<String>();
            List<String> readOnlyList = Collections.unmodifiableList(original);
            readOnlyList.add("vasya");


        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            LinkedList list = new LinkedList();
            list.get(-1);
        } catch (Exception e)
        {
            exceptions.add(e);
        }












































    }
}
