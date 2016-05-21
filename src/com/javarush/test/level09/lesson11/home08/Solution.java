package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] arr0 = {};
        int[] arr7 = {0, 1, 2, 3, 4, 5, 6};
        int[] arr4 = {0,1,2,3};
        int [] arr2 = {0,1};
        int[] arr5 = {0,1,2,3,4};
        ArrayList<int[]> myArray = new ArrayList<>();
        myArray.add(arr5);
        myArray.add(arr2);
        myArray.add(arr4);
        myArray.add(arr7);
        myArray.add(arr0);
        return myArray;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
