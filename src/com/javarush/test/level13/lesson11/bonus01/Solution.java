package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String nameFile = reader.readLine();
        String nameFile = "c:/Users/Dell/file.txt";

        Scanner scanner = new Scanner(new File(nameFile));
        ArrayList<Integer> list = new ArrayList<>();

        while ((scanner.hasNextInt())){
            int number = scanner.nextInt();
            if(number % 2 == 0)
                list.add(number);
        }

    }


}
