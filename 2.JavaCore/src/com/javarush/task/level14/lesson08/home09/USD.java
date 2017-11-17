package com.javarush.task.level14.lesson08.home09;

/**
 * Created by denis.denisenko on 10.03.2016.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    public String getCurrencyName(){
        return "USD";
    }
}
