package com.javarush.test.level08.lesson11.home09;

import java.util.Date;/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("jan 1 2020"));
    }

    public static boolean isDateOdd(String date)
    {

        Date startTime = new Date();
        startTime.setHours(0);
        startTime.setMinutes(0);
        startTime.setSeconds(0);

        startTime.setMonth(0);
        startTime.setDate(0);

        Date currTime = new Date(date);

        long day = (24 * 60 * 60 * 1000);
       int nowTime = (int) ((currTime.getTime()-startTime.getTime()) / day);
        System.out.println(nowTime);
        if (nowTime %2 ==0)
            return true;
        else
            return false;

//       return nowTime % 2 == 0 ? true : false;
        //return true;
    }
}
