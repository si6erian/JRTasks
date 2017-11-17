package com.javarush.test.level07.lesson06.task01;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("rfrfrf00");
        list.add("rfrfrf01");
        list.add("rfrfrf02");
        list.add("rfrfrf03");
        list.add("rfrfrf04");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
