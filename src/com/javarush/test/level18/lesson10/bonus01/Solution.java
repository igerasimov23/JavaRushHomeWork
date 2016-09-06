package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


/*
        BufferedReader reader = new BufferedReader(new FileReader(args[1]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[2], false));
        String line;

            while ((line = reader.readLine()) != null) {
                StringBuffer buffer = new StringBuffer(line);
                line = buffer.reverse().toString();
                writer.write(line);

            }

        reader.close();
        writer.close();*/

        if(args.length != 3)
            return;

       FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);

        while(inputStream.available() >0){
            int data = inputStream.read();
            outputStream.write(data ^ 2);
        }

        inputStream.close();
        outputStream.close();



    }

}
