package com.javarush.test.level19.lesson10.bonus03;

/* Знакомство с тегами
Считайте с консоли имя файла, который имеет HTML-формат
Пример:
Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span><span>Super</span><span>girl</span>
Первым параметром в метод main приходит тег. Например, "span"
Вывести на консоль все теги, которые соответствуют заданному тегу
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле
Количество пробелов, \n, \r не влияют на результат
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нету
Тег может содержать вложенные теги
Пример вывода:
<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
<span>Turanga Leela</span>
<span>Super</span>
<span>girl</span>

Шаблон тега:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1, text2 могут быть пустыми
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));

        String wholeText = "";
        while (reader.ready()){
            String line = reader.readLine();
            wholeText += line;
        }
        reader.close();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> finalList = new ArrayList<>();
//        System.out.println(wholeText);

        int last = wholeText.indexOf("<span>");




       /* try {
            while (true) {
                String s = "";
                int last = wholeText.indexOf("</span>")+ 7;
                s = wholeText.substring(0,last);
//                System.out.println(s);
                try {
                    s = s.substring(s.indexOf("<span"));
                } catch (Exception e) {

                }
                list.add(s);
                String newOne = wholeText.substring(last);
                wholeText = newOne;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }

        for (int i = 0; i < list.size(); i++) {
            String str = "";
            String s0 = list.get(i);



            String [] array = s0.split(".<span.");
            String [] array1 = s0.split(".</span.");
            if(array.length == array1.length)
                finalList.add(s0);
            else{
                s0 = s0 + list.get(i +1);
                finalList.add(s0);
                i++;
            }

//            System.out.println(Arrays.toString(array));

        }

        System.out.println(list);

        String str = list.get(0);
       String[] s = str.split("<span");
        System.out.println(Arrays.toString(s));


*/




//        String s = null;
//        String[] array = new String[0];
//        try {
//            while (true) {
//                int last = wholeText.indexOf("</span>")+ 7;
//                s = wholeText.substring(wholeText.indexOf("<span>"),last);
//                String newOne = wholeText.substring(last);
//                array = s.split("<span>");
//                System.out.println(array.length);
//                String s1 = "";
//                if(array.length > 1){
//                    last = newOne.indexOf("</span>")+ 7;
//                     s1 = newOne.substring(0, last);
//                    array = s1.split("<span>");
//                }
//                list.add(s +s1);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println(s);
////        String[] array = s.split("<span>");
//        System.out.println(Arrays.toString(array));
////        System.out.println(s1);


    }
}
