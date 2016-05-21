package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> child = new ArrayList<>();
        Human kid1 = new Human("kid1", true,10);
        Human kid2 = new Human("kid2", true,10);
        Human kid3 = new Human("kid3", true,10);
        Human mom = new Human("mom",false,33,kid1,kid2, kid3);
        Human dad = new Human("dad",true,33,kid1,kid2, kid3);
        Human grFather1 = new Human("ded1",true,88,mom);
        Human grFather2 = new Human("ded2",true,89,dad);
        Human grMother1 = new Human("grMom1",false,80,mom);
        Human grMother2 = new Human("grMom2",false,79,dad);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(grFather1);
        System.out.println(grFather2);
        System.out.println(grMother1);
        System.out.println(grMother2);
        //System.out.println(toString());
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex,int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, boolean sex,int age, Human kid1) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children.add(kid1);
        }

        public Human(String name, boolean sex,int age, Human kid1, Human kid2, Human kid3) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children.add(kid1);
            this.children.add(kid2);
            this.children.add(kid3);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
