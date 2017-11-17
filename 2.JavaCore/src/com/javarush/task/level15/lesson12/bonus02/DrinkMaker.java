package com.javarush.task.level15.lesson12.bonus02;

/**
 * Created by denis.denisenko on 12.09.2016.
 */
public abstract class DrinkMaker {
    public abstract void getRightCup();
    public abstract void putIngredient();
    public abstract void pour();
    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
