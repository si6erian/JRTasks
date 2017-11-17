package com.javarush.task.level14.lesson08.bonus03;

/**
 * Created by denis.denisenko on 25.03.2016.
 */
public class Singleton
{
    private static Singleton instance = null;
    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    private Singleton()
    {
    }
}
