package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String file = args[0];

        FileReader fr = new FileReader(file);
        BufferedReader rd = new BufferedReader(fr);
        String line;
        TreeMap<String, Double> treeMap = new TreeMap<>();



        while((line = rd.readLine()) != null){
            String [] array = line.split(" ");
            String name = array[0];
            Double value = Double.parseDouble(array[1]);
            if(treeMap.containsKey(name))
                treeMap.put(name,treeMap.get(name) + value);
            else
                treeMap.put(name,value);

        }

        for(Map.Entry<String, Double> map: treeMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }


        rd.close();
        fr.close();


    }
}
