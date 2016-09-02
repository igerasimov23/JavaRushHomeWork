package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        ArrayList<String> list = new ArrayList<>();

        String line;
        while(!(line = reader.readLine()).equals("end")){
            list.add(line);
        }
        Collections.sort(list);

        String[] outFile = list.get(0).split(".part");
        String outFileName = outFile[0];

        FileOutputStream outputStream = new FileOutputStream(outFileName);
        for(String s : list){
            FileInputStream inputStream = new FileInputStream(s);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            outputStream.write(buffer);
            inputStream.close();
        }

        System.out.println(outFileName);
        System.out.println(list);
        reader.close();
        outputStream.close();




    }
}
