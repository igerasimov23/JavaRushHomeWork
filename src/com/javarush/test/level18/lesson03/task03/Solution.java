package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        FileInputStream streamReader = new FileInputStream(filename);
        HashMap<Integer, Integer> map = new HashMap<>();

        //reading
        while(streamReader.available() > 0){
            int data = streamReader.read();

            if(map.containsKey(data)){
                map.put(data, map.get(data)+1);
            }
            else
                map.put(data,1);



        }
        int maxValue  = Collections.max(map.values());

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == maxValue)
            System.out.print(entry.getKey() + " ");
        }
        System.out.println("---------");
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
        }


        streamReader.close();
    }
}
