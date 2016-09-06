package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

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
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args[1].length() > 30)
            return;
        else if (args[2].length() > 8)
            return;
        else if (args[3].length() > 4)
            return;
        else if (args.length != 4)
            return;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));
        String id = null;

        String productName = args[1];
        String price = args[2];
        String quantity = args[3];

        while (productName.length() < 30) {
            productName = productName + " ";
        }

        while (price.length() < 8) {
            price = price + " ";
        }

        while (quantity.length() < 4) {
            quantity = quantity + " ";
        }

//    getting IDs
        String line;
        ArrayList<Integer> idList = new ArrayList<>();
        while ((line = fileReader.readLine()) != null) {
            id = line.substring(0, 8);
            id = id.replaceAll(" ", "");
            idList.add(Integer.parseInt(id));
        }
        Collections.sort(idList);
        if (idList.size() != 0) {
            id = String.valueOf(idList.get(idList.size() - 1) + 1);
            while (id.length() < 8) {
                id = id + " ";
            }
        } else {
            id = String.valueOf(1);
            while (id.length() < 8) {
                id = id + " ";
            }
        }


        String newFile = id + productName + price + quantity;
        fileWriter.write(newFile + "\n");


        fileReader.close();
        fileWriter.close();
        reader.close();


    }
}
