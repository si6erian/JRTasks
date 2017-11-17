package com.javarush.task.level15.lesson12.home04;

/**
 * Created by denis.denisenko on 07.09.2016.
 */
public class Earth implements Planet {
    /* private static volatile Earth instance;

    public static Earth getInstance()
    {
        Earth localInstance = instance;
        if (instance == null) {
            synchronized (Earth.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance;
                }
            }
        }
        return localInstance;
    } */
    private static Earth instance;
    private Earth(){}
    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }


}
