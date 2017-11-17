package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String,String> mapa = new HashMap<String, String>();
        //List<String> countries = new ArrayList<String>();
        //List<String> families = new ArrayList<String>();
        while (true){
            String country = reader.readLine();
            if (country.isEmpty()) break;
            String family = reader.readLine();
            mapa.put(country,family);
            //countries.add(country);
            //families.add(family);
        }

        String temp = reader.readLine();
        for (Map.Entry<String,String> pair : mapa.entrySet())
            if (pair.getKey().equals(temp))
                System.out.println(pair.getValue());

        /*
        if (countries.contains(temp)){
            int index = countries.indexOf(temp);
            System.out.println(families.get(index));
        }
*/
        //read home number
        /*
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size())
        {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }
        */
    }
}
