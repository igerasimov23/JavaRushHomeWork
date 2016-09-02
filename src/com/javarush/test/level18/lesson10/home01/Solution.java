package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {


        String filename = args[0];

        FileInputStream inputStream = new FileInputStream(filename);

        int data;
        int count = 0;
        while ((data = inputStream.read()) != -1) {
            if (data >=65 && data <=90 || data >=97 && data <=122)
                count++;
        }
        System.out.println(count);


        inputStream.close();


    }
}
