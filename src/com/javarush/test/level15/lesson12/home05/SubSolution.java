package com.javarush.test.level15.lesson12.home05;

public class SubSolution extends Solution {

    public SubSolution(int a) {
        super(a);
    }

    public SubSolution(int a, int b) {
        super(a, b);
    }

    public SubSolution() {
    }

     SubSolution(String s) {
        super(s);
    }

     SubSolution(String s1, String s2) {
        super(s1, s2);
    }

     SubSolution(String s1, String s2, String s3) {
        super(s1, s2, s3);
    }

    protected SubSolution(double s1, double s2) {
        super(s1, s2);
    }

    protected SubSolution(double s1, String s2) {
        super(s1, s2);
    }

    protected SubSolution(double s1, int a) {
        super(s1, a);
    }


    private SubSolution(Object a){   }
    private SubSolution(boolean a){   }
    private SubSolution(char a){   }
}
