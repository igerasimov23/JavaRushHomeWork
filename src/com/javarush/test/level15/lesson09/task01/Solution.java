package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(3.1,"efe");
        labels.put(6.6,"thtrhe67fe");
        labels.put(3.0,"efe35e");
        labels.put(6.5,"tht65rhefe");
        labels.put(6.9,"thtrjtjhefe");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
