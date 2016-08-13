package com.javarush.test.level15.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* Факториал
Написать метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа включая его.
Пример: 4! = factorial(4) = 1*2*3*4 = 24
1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию  factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
      /* long sum = 0;
        if(n == 0)
            return String.valueOf(0);
        else {
            sum = n;
            int i = 1;
           while(n > i){
               sum = sum * (n -i);
               i++;
           }
//            System.out.println(sum);
            return String.valueOf(sum);
        }*/

        if( n <0 )
            return String.valueOf(0);
        else if( n ==0)
            return String.valueOf(1);

        int max = n;
        BigInteger[] integers = new BigInteger[max+1];
        integers[0] = BigInteger.ZERO;
        integers[1] = BigInteger.ONE;

        if(n == 1)
            return String.valueOf(integers[1]);

        else {
            for(int i = 2; i <= max; i ++) {
                integers[i] = integers[i-1].multiply(BigInteger.valueOf(i));
            }
        }

        return String.valueOf(integers[max]);
    }
}
