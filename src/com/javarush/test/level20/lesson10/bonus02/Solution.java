package com.javarush.test.level20.lesson10.bonus02;

import java.util.ArrayList;
import java.util.Arrays;

/* Алгоритмы-прямоугольники
1. Дан двумерный массив N*N, который содержит несколько прямоугольников.
2. Различные прямоугольники не соприкасаются и не накладываются.
3. Внутри прямоугольник весь заполнен 1.
4. В массиве:
4.1) a[i, j] = 1, если элемент (i, j) принадлежит какому-либо прямоугольнику
4.2) a[i, j] = 0, в противном случае
5. getRectangleCount должен возвращать количество прямоугольников.
6. Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 1},
                {1, 1, 0, 0}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
//        System.out.println(a[3]);
    }

    public static int getRectangleCount(byte[][] a) {
        int mainColumn = 0;
        int mainRow = 0;
        int row, column;
        int x0 = -1, x1 = -1, y0 = -1, y1  = -1;
        System.out.println(a[3][3]);
        System.out.println("a length " + a.length);
        int [] posxy00 = {-1, -1};
        int [] posxy11 = {-1, -1} ;
        int temp0 = -1;
        int temp1 = -1;
        ArrayList<Byte> flow = new ArrayList<>();


        for( row =0 ; row < a.length; row++) {
            for ( column = 0; column < a.length; column++){
                System.out.println("column lenght " + a[row].length);

                flow.add(a[row][column]);
                if(a[row][column] == 1){
                    temp0 = 1;
                    if (y0 == -1){
                        y0 = row;
                        x0 = column;

                        posxy00 = new int[]{row, column};
                    }

                        y1 = row;
                        x1 = column;
                }
                if(a[row][column] == 0){

                    posxy11 = new int[]{row, column -1};
                    break;

                }
            }
//                System.out.print(a[row][column]);
            System.out.println(Arrays.toString(posxy00));
            System.out.println(Arrays.toString(posxy11));

            if (a[row][column] == 0 && temp0 == 1)
                break;
        }
        return 0;
    }

    public static int getOneRectangleCount(byte[][] a) {

        return 0;
    }
}
