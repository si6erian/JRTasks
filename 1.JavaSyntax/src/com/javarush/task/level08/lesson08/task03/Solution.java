package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("first", "Mila");
        map.put("second", "Mila");
        map.put("third", "Mila");
        map.put("first1", "Mila");
        map.put("second1", "Mila");
        map.put("third1", "Mila");
        map.put("first2", "Mila");
        map.put("second2", "Mila");
        map.put("third2", "Mila");
        map.put("third3", "Mila");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int k = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String s = pair.getValue();
            if (s.equals(name)) k++;
        }
        return k;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        int k = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String s = pair.getKey();
            if (s.equals(familiya)) k++;
        }
        return k;
    }

    public static void main(String[] args) throws Exception{
        HashMap<String, String> map1 = createMap();
        System.out.println("Совпадений по имени Mila " + getCountTheSameFirstName(map1, "Mila"));
        System.out.println("Совпадений по фамилии third " + getCountTheSameLastName(map1,"third"));
    }
}
