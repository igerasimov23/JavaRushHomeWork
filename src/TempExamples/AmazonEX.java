package TempExamples;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AmazonEX {

    public static Character nonRepatedCharacter(String str){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i)) +1);
            else
                map.put(str.charAt(i), 1);
        }

        //getting first non-repeated
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return null;

    }

    public static Character nonRepatedCharacterMethod2(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i)) +1);
            else
                map.put(str.charAt(i), 1);
        }

        //getting first non-repeated
        for(int i = 0; i < str.length(); i++){
            if(map.get(str.charAt(i)) == 1)
                return str.charAt(i);
        }
        return null;

    }


        public static void main(String[] args) {
           String word = "first non repeated chfracter";
            System.out.println(nonRepatedCharacterMethod2(word));

        }

}
