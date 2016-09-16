package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException{

        String file = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;
        HashMap<String, Double> map = new HashMap<>();
        while ((line = reader.readLine()) != null){
            String[] array = line.split(" ");
            String name = array[0];
            Double value = Double.parseDouble(array[1]);

            if(map.containsKey(name))
                map.put(name,map.get(name) + value);
            else
                map.put(name, value);
        }

        Double val = Collections.max(map.values());
        for (Map.Entry<String, Double> myMap : map.entrySet()){
         if(myMap.getValue().equals(val))
             System.out.println(myMap.getKey());
        }


        reader.close();
    }
}
