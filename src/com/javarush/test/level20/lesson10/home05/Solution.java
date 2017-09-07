package com.javarush.test.level20.lesson10.home05;

import java.io.*;
import java.util.logging.Logger;

/* Сериализуйте Person
Сериализуйте класс Person стандартным способом. При необходимости поставьте полям модификатор transient.
*/
public class Solution {

    public static void main(String[] args) throws Exception {

        String fileName = "text.txt";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream outputStream = new ObjectOutputStream(fos);

        Person person = new Person("il","ger", "rus", Sex.MALE);
//        System.out.println(person);
        outputStream.writeObject(person);

        fos.close();
        outputStream.close();

//        loading
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);

//        Solution loadedObject = (Solution) objectInputStream.readObject();

        fis.close();
        objectInputStream.close();


    }

    public static class Person implements Serializable{
        public final static long serialVersionUID = 1;
        String firstName;
        String lastName;
        String fullName;
        final String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }

        public Person()
        {
            this.greetingString = "Hello, ";
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }
}
