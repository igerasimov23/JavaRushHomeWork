package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();


    public static void main(String[] args)  {

        try {
            ArrayList<String> list = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName;
            while (!(fileName = reader.readLine()).equals("exit")){
                    list.add(fileName);
            }

            for(String s: list){
                ReadThread readThread = new ReadThread(s);
                readThread.start();
                readThread.join();
            }
            reader.close();
            System.out.println( resultMap);




        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class ReadThread extends Thread {
         private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;

        }
        // implement file reading here - реализуйте чтение из файла тут

        public void run(){



            try {
                HashMap<Integer,Integer> map = new HashMap<>();
                FileInputStream inputStream = new FileInputStream(fileName);
                int data;
                while ((data = inputStream.read()) != -1){
                    if(map.containsKey(data))
                        map.put(data,map.get(data) + 1);
                    else
                        map.put(data,1);
                }

                int maxValue = Collections.max(map.values());
                for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                    if(entry.getValue() == maxValue){
                        resultMap.put(fileName, entry.getKey());
                    }
                }
                inputStream.close();


            } catch (FileNotFoundException e) {

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
