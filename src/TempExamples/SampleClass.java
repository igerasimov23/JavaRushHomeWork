package TempExamples;

import java.util.Arrays;

/**
 * Created by Ilya on 1/28/2016.
 */
public class SampleClass {
    public static void main(String[] args) {
        String str = "eavdfef";
        String[] arr = str.split("");

        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random()*100);
            System.out.println(index);}

            Arrays.sort(arr);
            System.out.println(arr.toString());



    }

}

