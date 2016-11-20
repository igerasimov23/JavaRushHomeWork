package Interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,6,6,6,4,5,1};

        Set<Integer> set = new HashSet<>();

        for(int n : numbers){
            boolean unique = set.add(n);
//            System.out.println(unique);
            if (!unique)
                System.out.println(n);
        }





    }




}
