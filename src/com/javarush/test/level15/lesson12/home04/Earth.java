package com.javarush.test.level15.lesson12.home04;

public class Earth implements Planet{
    private Earth(){

    }
    private static Earth earth;
    public static Earth getInstance(){
        if(earth == null)
            earth = new Earth();
        return earth;
    }
}
