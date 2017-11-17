package com.javarush.task.level14.lesson06.home01;

/**
 * Created by denis.denisenko on 02.03.2016.
 */
public abstract class Hen{
    abstract int getCountOfEggsPerMonth();
    public String getDescription(){
        return "Я курица.";
    }
}