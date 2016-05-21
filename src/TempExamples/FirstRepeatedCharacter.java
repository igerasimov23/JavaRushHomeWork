package TempExamples;

import java.util.HashMap;

/**
 * Created by Ilya on 1/27/2016
 */
public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = "aabbcc";
        char c = firstNonRepeatedCharacter(s);
        System.out.println("The first non repeated character is :  " + c);
    }

    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            else
                map.put(str.charAt(i), 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
                return str.charAt(i);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) >= 1) {
                System.out.println(str.charAt(i));
                return str.charAt(i);


            }
        }
        return null;

    }
}
