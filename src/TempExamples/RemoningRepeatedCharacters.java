package TempExamples;

import java.util.LinkedHashSet;

public class RemoningRepeatedCharacters {
    public static void main(String[] args) {

        String str = "PriumeNumbers";
        String newStr = "";

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            boolean bool = set.add(str.charAt(i));
            if(bool){
                newStr = newStr + str.charAt(i);
            }
        }

        System.out.println(newStr);
        System.out.println(set);

    }
}
