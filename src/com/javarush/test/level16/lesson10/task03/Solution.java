package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        testThread.start();
        Thread.sleep(3000);
        testThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        int seconds = 4;

        public void run() {
            try {
                while (seconds > 0) {
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("finish");
            }
        }
    }
}
