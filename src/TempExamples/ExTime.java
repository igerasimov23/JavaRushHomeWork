package TempExamples;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ilya on 1/22/2016.
 */
public class ExTime {
    public static void main(String[] args)
    {
        Map<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Anil");
        hm.put(2, "Deven");
        hm.put(3, "sanjay");
        hm.put(4, "sanjay");
        hm.put(5, "Raj");
        hm.put(6, "sanjay");

        hm = invert(invert(hm));

        System.out.println(hm);
    }

    private static <K, V> Map<V, K> invert(Map<K, V> map)
    {
        Map<V, K> result = new HashMap<V, K>();
        for (Map.Entry<K, V> entry : map.entrySet())
        {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }


    }

