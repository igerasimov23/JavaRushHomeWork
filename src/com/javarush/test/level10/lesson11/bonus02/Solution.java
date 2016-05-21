package com.javarush.test.level10.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int id = 0;
        String name = null;

        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String strID = reader.readLine();
            if(strID.equals(""))
                break;


            name = reader.readLine();
            if(name.isEmpty()) break;
            else{
                id = Integer.parseInt(strID);
                map.put(name,id);
            }

        }

//        System.out.println("Id=" + id + " Name=" + name);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey().toString();
            Integer value = entry.getValue();
            System.out.println(value + " " + key);
        }
    }
}
