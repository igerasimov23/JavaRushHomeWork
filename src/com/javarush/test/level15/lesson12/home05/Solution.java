package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    public Solution(int a) {

    }
    public Solution(int a, int b) {

    }
    public Solution() {

    }

    Solution (String s){}
    Solution (String s1,String s2){}
    Solution (String s1, String s2, String s3){}

    protected Solution(double s1, double s2) {}
    protected Solution(double s1, String s2) {}
    protected Solution(double s1, int a) {}

    private Solution(Object a){}
    private Solution(boolean a){}
    private Solution(char a){}



}

