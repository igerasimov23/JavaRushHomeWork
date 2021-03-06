package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код

    private  String name;
    private int weight = 5;
    private int age = 2;
    private String color;
    private String address = "null";

    private Cat(String name) {
        this.name = name;
    }

    private Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    private Cat(String name, int age) {
        this.name = name;
        int weight = this.weight;
        this.age = age;
    }

    private Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        String name = this.name;
        String address = this.address;
        int age = this.age;
    }

    private Cat(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;

    }

}
