package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш кодjyjyj
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("ivanov", "vana123");
        map.put("ivanov", "vana5");
        map.put("ivanov1", "vana1");
        map.put("ivanov2", "vana6");
        map.put("ivanov3", "vana1");
        map.put("ivanov4", "vana1");
        map.put("ivanov4", "vana55");
        map.put("ivanov5", "vana78");
        map.put("ivanov5", "vana8");
        map.put("ivanov2", "vana");


        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
