package com.javarush.test.level14.lesson08.bonus03;

public class Singleton {


    private Singleton (){ }

    static Singleton obj;

    static Singleton getInstance(){
        if (obj == null)
        {
           obj = new Singleton();
        }

            return obj;
    }


}
