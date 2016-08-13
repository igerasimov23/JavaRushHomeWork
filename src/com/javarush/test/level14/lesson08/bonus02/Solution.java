package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println( NOD(a,b));
    }


    private static int NOD(int a, int b) {
        int iterations = min(a,b);
        int nod = 1;
        int i = 1;
        while (i <= iterations) {
            if((a % i == 0) && (b % i ==0)){
                nod = i;
            }
            i++;
        }
        return nod;
    }

    private static int min(int a, int b){
        return (a < b) ? a : b;
    }
}
