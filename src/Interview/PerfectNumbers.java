package Interview;

public class PerfectNumbers {

    public static boolean isPerfect(int perNumber) {

        int temp = 0;
        for (int i = 1; i < perNumber; i++) {
            if (perNumber % i == 0)
                temp += i;
        }
        if (temp == perNumber)
            return true;

        return false;

    }

    public static void main(String[] args) {

        for (int i = 1; i < 10000; i++) {
            if (isPerfect(i))
                System.out.println(i + " ");
        }
    }


}
