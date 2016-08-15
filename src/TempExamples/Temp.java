package TempExamples;

import java.text.ParseException;

public class Temp {
    public static void main(String[] args) throws ParseException {
       run();
    }

    public static void run() {
        String s = "";
        for (int i = 0; i < 1001; i++) {   //delay
            s += new String("" + i);
            System.out.println(s+ "\n");
            if (i == 1000) {
                s = " has finished the race!";
                System.out.println( s);

            }
        }
    }
}
