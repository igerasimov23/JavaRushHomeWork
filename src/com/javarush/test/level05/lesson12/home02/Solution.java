package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man m1 = new Man("peta", 21, "ehdjed");
        Man m2 = new Man("vana",22,"kegded");
        Woman w1 = new Woman("dasha", 32, "ssdd");
        Woman w2 = new Woman("masga", 45, "wewe");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(w1);
        System.out.println(w2);


        //выведи их на экран тут
    }

    //добавьте тут ваши классы
    public static class Man  {
         String name;
         int age;
         String address;

        public Man(String name,int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return name +" "+ age+" " + address;
        }
    }

    public static class Woman  {
        String name;
        int age;
        String address;

        public Woman(String name,int age,String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {return name +" "+ age+" " + address;}
    }


}
