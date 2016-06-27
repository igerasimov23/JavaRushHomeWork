package Interview;


//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
// How many different ways do you know to solve this problem?

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//
//        int[] copied = new int[10];
//        System.arraycopy(arr, 0, copied, 5, 5);//5 is the length to copy

//        System.out.println(Arrays.toString(copied));
             //[1,2,3,4,5,6,7]
            // [7,1,2,3,4,5,6]
        //     [6,7,1,2,3,4,5]

        int [] myArray = {1,2,3,4,5,6,7};
        int [] newArray = new int[6];

        for (int i = 0; i < 3; i++) {
            for (int j = myArray.length-1; j >0; j--) {
                int temp = myArray[j-1];
                myArray[j-1] = myArray[j];
                myArray[j] = temp;

            }
        }
        System.out.println(Arrays.toString(myArray));

    }


}
