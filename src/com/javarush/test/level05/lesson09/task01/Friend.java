package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    public String name, sex;
    public int age;

    private Friend(String name) {
        this.name =name;
    }
    private Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Friend (String name, String sex, int age) {
        this.name=name;
        this.age = age;
        this.sex = sex;
    }
}