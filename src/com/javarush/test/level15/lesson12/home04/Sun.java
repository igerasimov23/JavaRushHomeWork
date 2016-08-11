package com.javarush.test.level15.lesson12.home04;

public class Sun implements Planet{
    private Sun(){

    }
    private static Sun sun;
    public static Sun getInstance(){
        if(sun == null){
            sun = new Sun();
        }
        return sun;
    }
}
