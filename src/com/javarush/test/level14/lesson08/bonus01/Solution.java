package com.javarush.test.level14.lesson08.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception

            try {
                float i = 1 / 0;

            } catch (Exception e) {
                exceptions.add(e);
            }


        //Add your code here
        // 2nd
        try
        {
            List list = null;
            list.add(1);
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

//        3rd
        try {
            int[] array = new int[5];
            for (int i = 0; i <=5 ; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

//        4th
        try {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <=list.size() ; i++) {
                list.get(i);
            }
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

//        5th
        try {
            FileInputStream in = new FileInputStream("");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }


        // 6th
        try {
            String s = "tret";
            int num = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        // 7th
        try {
            List<Number> list = new LinkedList<Number>();
            list.add(new Float(-90 / -3));
            for (Number object : list) {
                //Исправь 2 ошибки
                if (object instanceof Float) {
                    Double a = (Double) object;
                    System.out.println("Is float value defined? " + a.isNaN());
                }
            }
        } catch (ClassCastException e) {
           exceptions.add(e);
        }

        // 8th
        try {
            int[] numbs = new int[-1];

        }catch(NegativeArraySizeException e) {
            exceptions.add(e);
        }

        // 9.
        try {
            throw new UnsupportedOperationException("Invalid operation for sorted list.");
        }catch(UnsupportedOperationException e) {
            exceptions.add(e);
        }

        // 10.
        try {
            throw new SecurityException("Hmmm maybe SecurityException");
        } catch (SecurityException e) {
            exceptions.add(e);
        }

    }
}
