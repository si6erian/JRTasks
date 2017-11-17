package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        //напишите тут ваш код
        Dog pitbul = new Dog("Pit",100,100);
        Cat catTom = new Cat("Tom", 30, 10);
        Mouse jerrydad = new Mouse("Dad",15,10);
        Cat homeless1 = new Cat("Homeless", 30,5);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    //добавьте тут ваши классы
    public static class Dog {
        String name;
        int weight;
        int height;
        public Dog(String name, int weight, int height){
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }
    public static class Cat {
        String name;
        int weight;
        int height;
        public Cat(String name, int weight, int height){
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }
}
