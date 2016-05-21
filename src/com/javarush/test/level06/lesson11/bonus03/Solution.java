package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int MyArray[] = new int[5];
        for (int i = 0; i < 5; i++)
        {
           MyArray[i]= Integer.parseInt(reader.readLine());
//            MyArray[i] = a;
        }

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++)
            {
                if (MyArray[j] > MyArray[j + 1])
                {
                    int Temp = MyArray[j];
                    MyArray[j] = MyArray[j + 1];
                    MyArray[j + 1] = Temp;
                }

            }
        }

       for (int i = 0; i < 5; i++)
        {
            System.out.println(MyArray[i]);

        }
        /*for (int i : MyArray)
        {
            System.out.print(i + "%n");*/
            //напишите тут ваш код

    }
}
