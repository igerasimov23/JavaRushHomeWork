package TempExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Ilya on 1/27/2016.
 */
public class NumberOfMonth {
    /* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

        public static void main(String[] args) throws IOException
        {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String month = reader.readLine();

            HashMap<String, Integer> date = new HashMap<>();
            date.put("Jan",1);
            date.put("Feb", 2);
            date.put("March", 3);
            date.put("Aprile", 4);
            date.put("May", 5);
            date.put("June",6);
            date.put("July", 7);
            date.put("August",8);
            date.put("Sept", 9);
            date.put("Oct", 10);
            date.put("Nov", 11);
            date.put("Dec", 12);

            Iterator<Map.Entry<String, Integer>> iterator = date.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<String,Integer> pair = iterator.next();
                String key = pair.getKey();
                Integer value = pair.getValue();
                if(key.equals(month))
                    System.out.println(key + " is " + value+ " month");
            }
        }


}
