package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();


        FileReader reader = new FileReader(file1);
        FileWriter writer = new FileWriter(file2);
        ArrayList<Integer> list = new ArrayList<>();

        while(reader.ready()){
            int data = reader.read();
            list.add(data);

        }

        for(int i = 0; i < list.size(); i ++){
            if(i % 2 == 1){
                writer.write(list.get(i));
            }
        }


        reader.close();
        writer.close();
        br.close();
    }
}
