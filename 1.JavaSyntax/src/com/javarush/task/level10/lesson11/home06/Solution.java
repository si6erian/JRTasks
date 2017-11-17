package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        public String name;
        public String country;
        public int age;
        public int weight;
        public int height;
        public String nation;

        public Human(String name){
            this.name = name;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, int weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        public Human(String name, String nation, String country){
            this.name = name;
            this.nation = nation;
            this.country = country;
        }
        public Human(String name, int age, int weight, int height){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
        public Human(String name, String country){
            this.name = name;
            this.country = country;
        }
        public Human(String name, String nation, int weight, int height){
            this.name = name;
            this.nation = nation;
            this.weight = weight;
            this.height = height;
        }
        public Human(int age){
            this.age = age;
        }
        public Human(int age, String country){
            this.age = age;
            this.country = country;
        }
        public Human(String name, String country, int age, int weight, int height, String nation){
            this.name = name;
            this.country = country;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.nation = nation;
        }


    }
}
