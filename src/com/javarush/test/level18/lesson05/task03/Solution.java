package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream in = new FileInputStream(file1);
        FileOutputStream outputStream2 = new FileOutputStream(file2);
        FileOutputStream outputStream3 = new FileOutputStream(file3);

        byte[] buffer = new byte[in.available()];
        int count = in.read(buffer);
        int frame1 = 0;
        int frame2 = 0;

       if(count > 0){
           if (count %2 == 0){
               frame1 = count /2;
               frame2 = frame1;
           }
           else {
               frame1 = (count/2) + 1;
               frame2 = count - frame1;
           }
       }



        outputStream2.write(buffer, 0, frame1);
        outputStream3.write(buffer, frame1, frame2);

        reader.close();
        in.close();
        outputStream2.close();
        outputStream3.close();

    }
}
