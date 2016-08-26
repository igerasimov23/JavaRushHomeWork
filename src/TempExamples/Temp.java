package TempExamples;

import java.text.ParseException;

public class Temp {
    public static void main(String[] args) throws ParseException {

        String[] arr = {"qw", "ede", "dfe", "dede"};
        double number = (arr.length - 2)% 3.0;
        System.out.println((arr.length - 2)% 3);
    }


}
