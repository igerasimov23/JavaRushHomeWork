package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("i", new Date("JULY 13 2010"));
        map.put("iv", new Date("MAY 3 2010"));
        map.put("iva", new Date("SEPTEMBER 3 2010"));
        map.put("ivan", new Date("JULY 3 2010"));
        map.put("ivano", new Date("MARCH 3 2010"));
        map.put("ivanova", new Date("JULY 23 2010"));
        map.put("ivanovaq", new Date("JULY 3 2010"));
        map.put("ivanovc", new Date("JULY 13 2010"));
        map.put("ivanovgh", new Date("AUGUST 3 2010"));


        //напишите тут ваш код
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            String key = pair.getKey();

            if (value.getMonth() >=5 && value.getMonth() <=7){
                iterator.remove();

            }
        }

    }
//     public static void print(HashMap<String, Date> map){
//         Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
//         while (iterator.hasNext()) {
//             Map.Entry<String, Date> pair = iterator.next();
//             Date value = pair.getValue();
//             String key = pair.getKey();
//             System.out.println(key + ":" + value);
//         }
//     }

    public static void main(String[] args) {
        createMap();
        //System.out.println(m);
        //print(createMap());
        removeAllSummerPeople(createMap());
        //print(createMap());
        System.out.println(createMap());
    }
}
