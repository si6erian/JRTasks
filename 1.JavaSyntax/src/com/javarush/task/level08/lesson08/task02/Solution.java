package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) set.add(i);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код

        //for (Integer temp : set)
        //    if (temp > 10) set.remove(temp);
        //return set;
        //set.removeIf(i -> i.intValue() > 10);
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            if (iter.next().intValue() > 10) {
                iter.remove();
            }
        }
        return set;
    }
}
