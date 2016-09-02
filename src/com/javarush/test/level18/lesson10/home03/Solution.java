package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream inputStream2 = new FileInputStream(file2);
        FileInputStream inputStream3 = new FileInputStream(file3);

        FileOutputStream outputStream = new FileOutputStream(file1);

        int data;
        while ((data = inputStream2.read()) != -1){
            outputStream.write(data);
        }

        while ((data = inputStream3.read()) != -1){
            outputStream.write(data);
        }

        reader.close();
        inputStream2.close();
        inputStream3.close();
        outputStream.close();





    }
}
