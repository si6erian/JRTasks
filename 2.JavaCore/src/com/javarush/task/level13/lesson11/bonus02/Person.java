package com.javarush.task.level13.lesson11.bonus02;

public class Person implements RepkaItem
{
    private String name;
    private String namePadezh;

    public String getNamePadezh(){
        return this.namePadezh;
    }

    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public void pull(Person person){
        System.out.println(this.name + " за " + person.getNamePadezh());
    }
}
