package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String name;
    private int age;
    private Boolean sex;

    //напишите тут ваш код
    public Friend(String name){
        this.name = name;
    }
    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Friend(String name, int age, Boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}