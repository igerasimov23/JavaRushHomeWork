package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String file = args[0];

        FileInputStream inputStream = new FileInputStream(file);

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int data;
        while((data = inputStream.read()) != -1){

                if(map.containsKey(data))
                    map.put(data, map.get(data) +1);
                else
                    map.put(data,1);

        }

        for(Map.Entry<Integer, Integer> tree : map.entrySet()){
            int c = tree.getKey();
            System.out.println((char)c + " " + tree.getValue());
        }

        inputStream.close();




    }
}
