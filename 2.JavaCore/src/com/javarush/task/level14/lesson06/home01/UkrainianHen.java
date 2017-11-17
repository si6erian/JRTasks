package com.javarush.task.level14.lesson06.home01;

/**
 * Created by denis.denisenko on 02.03.2016.
 */
public class UkrainianHen extends Hen{
    int getCountOfEggsPerMonth(){
        return 4;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
