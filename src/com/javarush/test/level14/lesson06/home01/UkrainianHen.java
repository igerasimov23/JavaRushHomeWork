package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Dell on 7/7/2016.
 */
public class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }
    String getDescription(){
        return (super.getDescription() + " Моя страна - " + Country.UKRAINE) + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
