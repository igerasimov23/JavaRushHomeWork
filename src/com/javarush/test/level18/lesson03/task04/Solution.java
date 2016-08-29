package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        HashMap<Integer, Integer> map = new HashMap<>();

        while(inputStream.available() > 0){
            int data = inputStream.read();
            if (map.containsKey(data)){
                map.put(data,map.get(data) + 1);
            }
            else
                map.put(data, 1);
        }

        int min = Collections.min(map.values());
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == min)
                System.out.println(entry.getKey() + " ");
        }





    }
}
