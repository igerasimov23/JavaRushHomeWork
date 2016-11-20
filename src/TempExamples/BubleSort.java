package TempExamples;

/**
 * Created by Ilya on 5/7/2016.
 */
public class BubleSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 56};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1; j++) {

                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int x : array) {
            System.out.println(x);

        }
    }
}
