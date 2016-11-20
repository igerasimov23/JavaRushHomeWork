package TempExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ilya on 9/25/2016.
 */
public class tempe22 {

    public static boolean isPangramString(String s) {

        if (s.length() < 26)
            return false;

        for (Character c : s.toLowerCase().replaceAll(" ", "").toCharArray())
        {
            if (c<'a' || c>'z')
            {
                return false;
            }
        }
        return true;
    }

    public static String listMissingLetters(String pangram)
    {
        if (!isPangramString(pangram))
        {
            return pangram + " is not a pangram.";
        }

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        List<Character> pangramList = new LinkedList<>();
        List<Character> alphaList = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (char c : pangram.toLowerCase().toCharArray())
        {
            pangramList.add(c);
        }

        for (char c : alphabet.toCharArray())
        {
            alphaList.add(c);
        }

        for (Iterator<Character> c = alphaList.iterator(); c.hasNext();)
        {
            if (pangramList.contains(c.next()))
            {
                c.remove();
            }
        }

        for (Character c : alphaList)
        {
            builder.append(c);
        }
        return builder.toString();
    }
}
