package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    private Double centerX;
    private Double centerY;
    private Double radius;
    private Double width;
    private String color;

    public Circle(Double centerX, Double centerY, Double radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public Circle(Double centerX, Double centerY, Double radius, Double width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public Circle(Double centerX, Double centerY, Double radius, Double width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

}
