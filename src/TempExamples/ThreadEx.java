package TempExamples;

public class ThreadEx {

    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread();
            //напишите тут ваш код
        }
    }

    public static class SleepingThread extends Thread {


        }

        public void run() {

            System.out.println("thread");

        }
}
