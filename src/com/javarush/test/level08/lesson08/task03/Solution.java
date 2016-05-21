package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> myMap = new HashMap<>();
        myMap.put("1", "Ivanov");
        myMap.put("2", "Ivanov");
        myMap.put("3", "Ivanov");
        myMap.put("4", "Ivanov");
        myMap.put("5", "Ivanov");
        myMap.put("6", "Sidoro");
        myMap.put("7", "Sidorv");
        myMap.put("8", "Sidorvv");
        myMap.put("9", "Sidorvvv");
        myMap.put("10", "Sidorvvvv");

        return myMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count =0;
        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name))
                count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count =0;
        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(lastName))
                count++;
        }
        return count;

    }
}
