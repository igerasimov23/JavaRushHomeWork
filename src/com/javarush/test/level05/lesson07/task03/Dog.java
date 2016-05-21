package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    private String name, color;
    private int height;

    public void initialize (String name){
        this.name = name;
    }

    public void initialize (String name, int height){
        this.name = name;
        this.height = height;
    }

    public void initialize (String name, int height, String color) {
        this.height = height;
        this.name = name;
        this.color = color;
    }

}
