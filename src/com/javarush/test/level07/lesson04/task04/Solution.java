package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] Numbers = new int[10];
        for (int i = 0; i < 10 ; i++)
        {
            Numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int[] Temp = new int[10];
        for (int i = 0; i < 10; i++)
        {
            Temp[i] = Numbers[9 - i];
        }

        for (int i = 0; i < Temp.length; i++)
        {
            System.out.println(Temp[i]);

        }


        //напишите тут ваш код

    }
}
