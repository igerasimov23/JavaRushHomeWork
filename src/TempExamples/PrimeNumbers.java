package TempExamples;

/**
 * Created by Ilya on 2/4/2016.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
       int num = 12345;
        int rev = 0;
        while(num !=0){
            rev = rev *10;
            rev = rev + num%10;
            num = num/10;
        }
        System.out.println(rev);
    }

}