package TempExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ilya on 1/28/2016.
 */
public class DescendOrderMap {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
//        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i =0; i<5; i++) {
            String k = reader.readLine();
            Integer v = Integer.parseInt(reader.readLine());
//            String str = scanner.nextLine();
//            int myInt = scanner.nextInt();

            map.put(k, v);
        }

       for( Map.Entry<String, Integer> m : map.entrySet())
           System.out.println(m.getKey() +" " + m.getValue());



    }

}
