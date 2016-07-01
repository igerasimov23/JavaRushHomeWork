package Interview;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] myArray = {1,1,2,3,4,5,4,3};
        HashMap<Integer,Integer> map = removeDupl(myArray);

        for(Map.Entry<Integer, Integer> entry: map.entrySet() )
            System.out.println(entry.getKey());

    }

   public static HashMap<Integer, Integer> removeDupl(int[] array) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], 0);
        }

       return map;
    }

}
