package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("ivanov1", "peta8");
        map.put("ivanov2", "peta7");
        map.put("ivanov3", "peta6");
        map.put("ivanov4", "peta5");
        map.put("ivanov5", "peta4");
        map.put("ivanov6", "peta3");
        map.put("ivanov7", "peta2");
        map.put("ivanov8", "peta1");
        map.put("ivanov9", "peta1");
        map.put("ivanov10", "peta1");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> d=new ArrayList<String>();
        for(Map.Entry<String, String> pair:map.entrySet())d.add(pair.getValue());
        for (int i = 0; i <d.size(); )
        { int count=0;
            for (int j = 0; j <d.size();j++ )
            {
                if ((d.get(i).equals(d.get(j)))&&i!=j)count++;
            }
            if(count==0)d.remove(i);
            else i++;
        }
        for (int k = 0; k <d.size(); k++)
        {
            removeItemFromMapByValue(map,d.get(k));
        }
    }
   /* my Example
   public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> map1 = new HashMap<>();

        for (Map.Entry<String, String> pair : map.entrySet()){
            map1.put(pair.getValue(),pair.getKey());
        }

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            String key = pair.getKey();
            iterator.remove();
        }

        for (Map.Entry<String, String> pair : map1.entrySet())
            map.put(pair.getValue(),pair.getKey());
    }*/





    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }
    }



}