package com.javarush.test.level08.lesson11.home09;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/


public class Solution
{
    private static DateFormatSymbols myDateFormatSymbols = new DateFormatSymbols(){

        @Override
        public String[] getMonths() {
            return new String[]{"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
                    "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        }

    };

    public static void main(String[] args){
        //
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d YYYY", myDateFormatSymbols);
        Date d2 = new Date();
        String date3 = dateFormat.format(d2).toString();
        System.out.println(date3 + " = " + isDateOdd(date3));
    }

    public static boolean isDateOdd(String date)
    {

        Date yearStartTime = new Date(date);
        yearStartTime.setMonth(0);
        yearStartTime.setDate(1);
        Date GetNewTime = new Date(date);
        long difference = GetNewTime.getTime() - yearStartTime.getTime();
        long msPerDay = 24 * 60 * 60 * 1000;
        int countDays = (int)(difference / msPerDay);
        return countDays % 2 == 0;

    }
}
