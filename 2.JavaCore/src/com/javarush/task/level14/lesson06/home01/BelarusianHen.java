package com.javarush.task.level14.lesson06.home01;

/**
 * Created by denis.denisenko on 02.03.2016.
 */
public class BelarusianHen extends Hen{
    int getCountOfEggsPerMonth(){
        return 2;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
