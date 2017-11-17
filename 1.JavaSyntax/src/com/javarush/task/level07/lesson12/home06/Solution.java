package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human granfather1 = new Human("Дедушка Вася", true, 60, null, null);
        Human granfather2 = new Human("Дедушка Петя", true, 60, null, null);
        Human granmother1 = new Human("Бабушка Коля", false, 60, null, null);
        Human granmother2 = new Human("Бабушка Иван", false, 60, null, null);
        Human father1 = new Human("Папа Павел", true, 30, granfather1, granmother1);
        Human mother1 = new Human("Мама Олег", false, 30, granfather2, granmother2);
        Human kid1 = new Human("Аня", true, 10, father1, mother1);
        Human kid2 = new Human("Катя", true, 11, father1, mother1);
        Human kid3 = new Human("Игорь", true, 12, father1, mother1);

        System.out.println(granfather1);
        System.out.println(granfather2);
        System.out.println(granmother1);
        System.out.println(granmother2);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        Human (String name, Boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
