package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int total = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        while (true)
        {
            String num = reader.readLine();
            if (num.equals("сумма"))
                {break;}
            else {
                int num2 = Integer.parseInt(num);
                total += num2;

             }

        }System.out.println(total);

    }
}
