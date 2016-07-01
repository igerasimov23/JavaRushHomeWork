package Interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dell on 6/29/2016.
 */
public class REgExpressGetInt {
    public static void main(String[] args) {

        Pattern intsOnly = Pattern.compile("\\d+");
        Matcher makeMatch = intsOnly.matcher("dThis ad will end in 10 seconds.");
        makeMatch.find();
        String inputInt = makeMatch.group();
        System.out.println(inputInt);


    }
}
