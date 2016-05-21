package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int i = Integer.parseInt(reader.readLine());
        int i=0;
        int sum = 0;
        while (i != -1){
            int num = Integer.parseInt(reader.readLine());
            //String str = reader.readLine();
           // i = Integer.parseInt(str);
            //d = s + d;
            i=num;

            sum += i;
            //System.out.println(sum);




        }
        System.out.println(sum);

    }
}
