package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int count = 0;
        String line = null;
        while ((line = br.readLine()) != null){
            String[] str = line.split("[\\p{Punct} || \\p{Blank}]");
            for(int i = 0; i < str.length; i++){
                if(str[i].equals("world"))
                    count++;
            }
        }
        br.close();
        System.out.println(count);






    }
}
