package TempExamples;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ilya on 1/27/2016
 */
public class FirstRepeatedCharacter {
    public static void main(String[] args) {


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
            for (Map.Entry<Character, Integer> entry : map.entrySet()){
                if(str.charAt(i) == entry.getKey()){
                    if(entry.getValue() == 1) {
                        return str.charAt(i);

                    }
                }

            }

        }

        throw new RuntimeException("did not find ");


    }
}
