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
    //напишите тут ваш код
    private int top;
    private int left;
    private int width = 0;
    private int height = 0;

    public void initialize (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize (int top, int left) {
        this.top = top;
        this.left = left;
        int width = this.width;
        int height = this.height;
    }

    public void initialize (int top,int left, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        int height = this.height;
    }

    public void initialize (Rectangle R1) {
        this.left = R1.left;
        this.width = R1.width;
        this.top = R1.top;
        this.height = R1.height;
    }

}
