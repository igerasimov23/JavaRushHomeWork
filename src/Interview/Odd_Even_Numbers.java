package Interview;

/**
 * Created by Ilya on 6/26/2016.
 */
public class Odd_Even_Numbers {

    public static void main(String[] args) {
        int num = 10;

        printOddNumbers(num);
        printEvenNumbers(num);


    }

    public static void printOddNumbers(int num) {
        for(int i = 0; i < num; i++){
            if(i % 2 == 1)
                System.out.println(i);
        }
    }

    public static void printEvenNumbers(int num) {
        for(int i = 0; i < num; i++){
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
}
