package com.javarush.test.level08.lesson08.task04;


import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Calendar;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args) throws Exception{
        HashMap<String, Date> map1 = createMap();
        System.out.println(map1.size());
        removeAllSummerPeople(map1);
        for (HashMap.Entry<String, Date> pair : map1.entrySet()) System.out.println(pair.getKey() + " - " + pair.getValue());
    }
    /*
        public static String randomString(int length){
            String result  = "";
            Random random = new Random();
            char[] chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
            for (int i = length; i > 0; i--){
                result += chars[random.nextInt(chars.length)];
            }
            return result;
        }
    */
    public static Date randomDate(){
        Random rnd = new Random();
        long ms =  -946771200000L + (Math.abs(rnd.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));
        return new Date(ms);
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        //map.put("Stallone", new Date("JUNE 1 1980"));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 5);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.YEAR, 1980);
        Date stallone = cal.getTime();

        map.put("Stallone", stallone);

        //напишите тут ваш код
/*
        map.put("1", stallone);
        map.put("2", stallone);
        map.put("3", stallone);
        map.put("4", stallone);
        map.put("5", stallone);
        map.put("6", stallone);
        map.put("7", stallone);
        map.put("8", stallone);
        map.put("9", stallone);
*/
        for (int i = 0; i < 9; i++) map.put("Stallone" + i, randomDate());
//      for (int i = 0; i < 9; i++) map.put(randomString(8), randomDate());
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        HashSet<String> temp = new HashSet<String>();
        Calendar cal = Calendar.getInstance();
        for (HashMap.Entry<String, Date> pair : map.entrySet()){
            cal.setTime(pair.getValue());
            if (cal.get(Calendar.MONTH) >= Calendar.JUNE && cal.get(Calendar.MONTH) <= Calendar.AUGUST) temp.add(pair.getKey());
        }
        for (String aTemp : temp) map.remove(aTemp);
    }
}
