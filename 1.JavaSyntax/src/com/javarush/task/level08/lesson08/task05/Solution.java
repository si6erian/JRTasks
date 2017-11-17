package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    public static void main(String[] args)throws Exception{
        HashMap<String, String> map1 = createMap();
        removeTheFirstNameDuplicates(map1);
        for (Map.Entry<String, String> pair: map1.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());
    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("fam11", "name1");
        map.put("fam12", "name2");
        for (int i = 0; i < 8; i++)
            map.put("fam"+i, "name"+i);
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, String> pair: map.entrySet()){
            int k = 0;
            for (Map.Entry<String, String> pair2: copy.entrySet())
                if (pair.getValue().equals(pair2.getValue()))
                    k++;
             if (k > 1)
                 list.add(pair.getValue());
        }
        for (String text : list)
            removeItemFromMapByValue(map, text);
//            System.out.println(text);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
