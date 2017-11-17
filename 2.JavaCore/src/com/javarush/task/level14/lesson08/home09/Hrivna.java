package com.javarush.task.level14.lesson08.home09;

/**
 * Created by denis.denisenko on 10.03.2016.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }

    public String getCurrencyName(){
        return "HRN";
    }

}
