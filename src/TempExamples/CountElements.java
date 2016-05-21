package TempExamples;

import java.util.HashMap;

//given a string, calculate the frequency of characters, output the array with the
// letter and frequency. (such as: for “abbcdc”, the output should be (a,1),(b,2),(c,2),(d,1))
public class CountElements {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "abca";
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            else
                map.put(str.charAt(i),1);


        }
        for( HashMap.Entry<Character, Integer> e : map.entrySet())
            System.out.println(e.getKey() + " : " + e.getValue());
    }
}
