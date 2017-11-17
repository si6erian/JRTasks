package com.javarush.task.level15.lesson12.home04;

/**
 * Created by denis.denisenko on 07.09.2016.
 */
public class Sun implements Planet {
    /* private static volatile Sun instance;

    public static Sun getInstance()
    {
        Sun localInstance = instance;
        if (instance == null) {
            synchronized (Sun.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance;
                }
            }
        }
        return localInstance;
    } */
    private static Sun instance;
    private Sun(){}
    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
