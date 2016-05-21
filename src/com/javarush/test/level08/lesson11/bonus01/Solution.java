package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        HashMap<String, Integer> date = new HashMap<>();
        date.put("January",1);
        date.put("February", 2);
        date.put("March", 3);
        date.put("Aprile", 4);
        date.put("May", 5);
        date.put("June",6);
        date.put("July", 7);
        date.put("August",8);
        date.put("September", 9);
        date.put("October", 10);
        date.put("November", 11);
        date.put("December", 12);

        Iterator<Map.Entry<String, Integer>> iterator = date.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if(key.equalsIgnoreCase(month))
                System.out.println(key + " is " + value+ " month");
    }
    }

}

