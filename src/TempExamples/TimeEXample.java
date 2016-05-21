package TempExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ilya on 1/27/2016.
 */
public class TimeEXample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true)
        {
            String city = reader.readLine();
            String family = reader.readLine();
            if (family.isEmpty() )
                break;
            if (city.isEmpty() )
                break;

            addresses.add(city);
            addresses.add(family);
            addresses.add(family);
        }

        String city1 = reader.readLine();
        Iterator<String> iterator = addresses.iterator();
        while (iterator.hasNext()){
            if(iterator.equals(city1)){
                System.out.println(iterator.next());
            }
        }

// check git
//        commit2
// commit 3
//        commit4
// commit5
    }
}
