package TempExamples;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Ilya on 1/28/2016.
 */
public class ExSample {
    public static void main(String[] args) {

                       String s = " A A ABc  d BBAB";

            char[] chars = s.toCharArray();

            Set <Character> charSet = new LinkedHashSet<Character>();
            for(int i =0; i< s.length(); i++) {
                if(s.charAt(i)==' ') {
                    i++;
                }
                else
                    charSet.add(s.charAt(i));
            }
        System.out.println(charSet);

    }

}

