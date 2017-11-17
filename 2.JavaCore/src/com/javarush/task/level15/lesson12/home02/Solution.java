package com.javarush.task.level15.lesson12.home02;

/* Тренировка мозга
Найти логическую ошибку: метод doAction в реализации интерфейса Movable должен выдавать "moving".
Исправьте ошибку, при необходимости измените (отрефакторите) интерфейс Movable.
Результат вывода в консоль должен быть:
flying
moving
*/

public class Solution {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static class Duck implements Flyable, Movable {
        @Override
        public void doAction(Flyable flyable) {
            System.out.println("flying");
        }
        @Override
        public void doAction(Movable movable) {
            System.out.println("moving");
        }
    }

    public static class Util {
        static void fly(Flyable animal) {
            animal.doAction(animal);
        }

        static void move(Movable animal) {
            animal.doAction(animal);
        }
    }

    public static interface Flyable {
        void doAction(Flyable flyable);
    }

    public static interface Movable {
        void doAction(Movable movable);
    }
}
