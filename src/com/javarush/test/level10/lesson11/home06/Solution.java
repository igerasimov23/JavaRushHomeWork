package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы

        String fName;
        String lName;
        String midName;
        int age;
        String address;
        int numOfKids;

        public Human(String fName, String lName, String midName, int age, String address, int numOfKids) {
            this.fName = fName;
            this.lName = lName;
            this.midName = midName;
            this.age = age;
            this.address = address;
            this.numOfKids = numOfKids;
        }

        public Human(String fName, String lName, String midName, int age, String address) {
            this.fName = fName;
            this.lName = lName;
            this.midName = midName;

            this.age = age;
            this.address = address;
        }

        public Human(String midName, int age, String address, int numOfKids) {
            this.midName = midName;
            this.age = age;
            this.address = address;
            this.numOfKids = numOfKids;
        }

        public Human(String fName, String lName, String midName) {

            this.fName = fName;

            this.lName = lName;

            this.midName = midName;
        }

        public Human(String midName, int age, String address) {
            this.midName = midName;
            this.age = age;
            this.address = address;
        }

        public Human(String fName, String lName, String midName, int age) {

            this.fName = fName;
            this.lName = lName;
            this.midName = midName;
            this.age = age;
        }

        public Human(String midName, int age) {
            this.midName = midName;
            this.age = age;
        }

        public Human(int age, String address) {
            this.age = age;
            this.address = address;
        }

        public Human(String lName, String fName) {

            this.lName = lName;
            this.fName = fName;

        }

        public Human(String fName) {
            this.fName = fName;

        }





    }
}
