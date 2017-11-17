package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> kids = new ArrayList<Human>();
        Human kid1 = new Human("Son Valera", true, 6, new ArrayList<Human>());
        Human kid2 = new Human("Son Kolya", true, 16, new ArrayList<Human>());
        Human kid3 = new Human("Daughter Niki", false, 10, new ArrayList<Human>());
        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);
        ArrayList<Human> fathers = new ArrayList<Human>();
        ArrayList<Human> mothers = new ArrayList<Human>();
        Human otec = new Human("Otec Kolya", true, 30, kids);
        Human mater = new Human("Mater Rosa", false, 40, kids);
        mothers.add(mater);
        fathers.add(otec);
        Human ded1 = new Human("Ded Ivan", true, 70, fathers);
        Human ded2 = new Human("Ded Sasha", true, 80, mothers);
        Human bab1 = new Human("Baba Seva", false, 90, fathers);
        Human bab2 = new Human("Baba Kira", false, 100, mothers);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(otec);
        System.out.println(mater);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private Boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, Boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
