package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> result = new ArrayList<String>();
        for (int i =0;  i < 10;i++)
        {
            result.add(reader.readLine());
        }

        ArrayList<String> result1 = doubleValues(result);

        //Вывести на экран result
        for(String s: result1)
            System.out.println(s);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        ArrayList<String> temp = new ArrayList<String>();
        //напишите тут ваш код
        for(int i=0; i<list.size(); i++)
        {
            temp.add(list.get(i));
            temp.add(list.get(i));
        }


        return temp;
    }
}
