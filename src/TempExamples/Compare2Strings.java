package TempExamples;


import java.util.Arrays;
import java.util.HashMap;

public class Compare2Strings {
    public static void main(String[] args) {

        HashMap<Character, Integer> map1;
        HashMap<Character, Integer> map2;

        String str1 = "aabbccdd";
        String str2 = "cczaabbdd";


        map1 = map(str1);
        map2 = map(str2);

       if(sortString(str1).equals(sortString(str2)))
           System.out.println("str equals");
        else
           System.out.println("not equal");

        if(map1.equals(map2))
            System.out.println("Strings are anagram");
        else
            System.out.println("Strings are not anagram");



    }

    public static HashMap<Character, Integer> map (String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            else
                map.put(str.charAt(i),1);
        }
        return map;
    }


    public static String sortString(String str){
        char[] chars = str.toCharArray();
         Arrays.sort(chars);
        return String.valueOf(chars);

    }


}
