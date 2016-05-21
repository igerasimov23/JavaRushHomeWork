package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода,
 вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    }

    public static String method1()
    {
        method2();
        System.out.println(method2());
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    public static String method2()
    {
        method3();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    public static String method3()
    {
        method4();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[2].getMethodName();

    }

    public static String method4()
    {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements4 = Thread.currentThread().getStackTrace();
        return stackTraceElements4[2].getMethodName();
    }

    public static String method5()
    {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements)
//        {
//            System.out.println(element.getMethodName());
//        }
        return stackTraceElements[2].getMethodName();

    }
}
