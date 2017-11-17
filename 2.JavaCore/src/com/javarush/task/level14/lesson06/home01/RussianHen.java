package com.javarush.task.level14.lesson06.home01;

/**
 * Created by denis.denisenko on 02.03.2016.
 */
public class RussianHen extends Hen{
    int getCountOfEggsPerMonth(){
        return 5;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
