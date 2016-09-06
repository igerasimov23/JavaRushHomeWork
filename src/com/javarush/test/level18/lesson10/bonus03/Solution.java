package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();



        String token = args[0];
        switch (token) {
            case "-u":
                String id = args[1];

                String productName = args[2];
                 if (args.length > 5){
                    for (int i = 3; i < args.length -2; i++){
                        productName = productName + " " + args[i] ;
                    }
                }


                String price = args[args.length-2];
                String quantity = args[args.length-1];


                if (id.length() > 8)
                    return;
                else if (productName.length() > 30)
                    return;
                else if (price.length() > 8)
                    return;
                else if (quantity.length() > 4)
                    return;

                BufferedReader fileReader = new BufferedReader(new FileReader(fileName));


                ArrayList<String> fileList = new ArrayList<>();

                String line;
                String newLine;
                String newID;
                while ((line = fileReader.readLine()) != null) {
                    fileList.add(line);
                }

                for (int i = 0; i < fileList.size(); i++) {
                    line = fileList.get(i);
                    newID = line.substring(0,8);
                    newID = newID.replaceAll(" ", "");
                    System.out.println(id);
                    System.out.println(newID);
                    if (newID.equals(id)) {
                        while (productName.length() < 30) {
                            productName = productName + " ";
                        }

                        while (price.length() < 8) {
                            price = price + " ";
                        }

                        while (quantity.length() < 4) {
                            quantity = quantity + " ";
                        }
                        while (id.length() < 8) {
                            id = id + " ";
                        }
                        newLine = id + productName + price + quantity;
                        fileList.set(i, newLine);

                    }
                }
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
                for (int i = 0; i <fileList.size(); i ++){
                    fileWriter.write(fileList.get(i) + "\n");
                }

                fileReader.close();
                fileWriter.close();

                return;
            case "-d":
                if (args.length != 2)
                    return;
                 id = args[1];
                fileReader = new BufferedReader(new FileReader(fileName));
                ArrayList<String> fileListR = new ArrayList<>();


                while ((line = fileReader.readLine()) != null) {
                    fileListR.add(line);
                }
                for (int i = 0; i < fileListR.size(); i ++){
                    line = fileListR.get(i);
                    newID = line.substring(0,8);
                    newID = newID.replaceAll(" ", "");
                    if(newID.equals(id)){
                        fileListR.remove(i);
                    }
                }
                BufferedWriter fileWriterR = new BufferedWriter(new FileWriter(fileName));
                for (int i = 0; i <fileListR.size(); i ++){
                    fileWriterR.write(fileListR.get(i) + "\n");
                }

                fileReader.close();
                fileWriterR.close();

                return;

        }



    }

}

