package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String>list = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            String s = bufferedReader.readLine();
            list.add(s);
        }

        String temp = "";
        for (int j = 0; j < 5; j++)
        {

            String s = list.get(j);
           if (s.length() > temp.length())
           {
               temp = s;
           }
        }
        //System.out.println(temp);

        for (int i = 0; i < 5; i++)
        {
            String s = list.get(i);
            if (temp.length() == s.length())
            {
                System.out.println(temp);
            }
        }
    }

}
