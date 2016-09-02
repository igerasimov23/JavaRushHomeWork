package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file);
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        ArrayList<Double> list = new ArrayList<>();

        while ((line = fileReader.readLine()) != null){
            String[] array = line.split(" ");
            for(String temp : array){
                list.add(Double.parseDouble(temp));
            }
        }

        FileWriter writer = new FileWriter(file2);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        for(Double d : list){
            bufferedWriter.write(String.valueOf(Math.round(d)) + " ");
        }

        reader.close();
        inputStream.close();
        fileReader.close();

        bufferedWriter.close();
        writer.close();

    }
}
