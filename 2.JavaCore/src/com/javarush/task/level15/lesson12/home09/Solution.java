package com.javarush.task.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String [] url = reader.readLine().split("[?&]");
            reader.close();
            for (int i = 1; i < url.length; i++) {
                if (url[i].contains("=")) {
                    System.out.print(url[i].split("[=]")[0] + " ");
                } else {
                    System.out.print(url[i] + " ");
                }
            }
            System.out.println();
            for (int i = 1; i < url.length; i++) {
                if (url[i].contains("="))
                    if ((url[i].split("[=]")[0].equals("obj")) && (!url[i].split("[=]")[1].isEmpty()))
                        try {
                            alert(Double.parseDouble(url[i].split("[=]")[1]));
                        } catch (Exception e2) {
                            alert(url[i].split("[=]")[1]);
                        }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
