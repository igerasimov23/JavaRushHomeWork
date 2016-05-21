package TempExamples;


/**
 * Created by Ilya on 1/25/2016.
 */


public class AmazonEX {




        public static void main(String[] args) {
            String[] table = {"aa", "bb", "cc"};
            for (String ss: table) {
                int ii = 0;
                while (ii < table.length) {
                    System.out.println(ss + ", " + ii);
                    ii++;
                }
            }
        }

}
