package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int j = 10;
        int i = 10;
        while ( j>0) {
            while (i>0)
            {
                System.out.print("S");
                i--;
            }
               i =10;
            System.out.println();
            j--;

        }

    }
}