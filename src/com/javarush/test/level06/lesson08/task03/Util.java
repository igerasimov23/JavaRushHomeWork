package com.javarush.test.level06.lesson08.task03;

/* Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        //напишите тут ваш код

        double X = x1-x2;
        double Y = y1-y2;
        double a = Math.pow(X,2) + Math.pow(Y,2);
        double dist = Math.sqrt(a);
        return dist;

    }

  /*  public static void main(String[] args)
    {
        double b = getDistance(1,2,3,4);
        System.out.println(b);
    }*/
}
