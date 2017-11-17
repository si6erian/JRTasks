package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //Напишите тут ваш код
    int top, left, width, height;

    public void initialize(int top, int left, int width, int height){
        this.left = left;
        this.height = height;
        this.top = top;
        this.width = width;
    }
    public void initialize(int top, int left){
        this.left = left;
        this.height = 0;
        this.top = top;
        this.width = 0;
    }
    public void initialize(int top, int left, int width){
        this.left = left;
        this.height = width;
        this.top = top;
        this.width = width;
    }
    public void initialize(Rectangle rect){
        this.left = rect.left;
        this.height = rect.height;
        this.top = rect.top;
        this.width = rect.width;
    }



}
