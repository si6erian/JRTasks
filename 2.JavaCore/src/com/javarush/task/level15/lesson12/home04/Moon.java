package com.javarush.task.level15.lesson12.home04;

/**
 * Created by denis.denisenko on 07.09.2016.
 */
public class Moon implements Planet {
    /* private static volatile Moon instance;

    public static Moon getInstance()
    {
        Moon localInstance = instance;
        if (instance == null) {
            synchronized (Moon.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance;
                }
            }
        }
        return localInstance;
    } */
    private static Moon instance;
    private Moon(){}
    public static Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}
