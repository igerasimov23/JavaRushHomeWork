package Interview;


public class Fabinochi {


    public static void main(String[] args) {
        printFab(7);

    }

    public static void printFab(int number) {

        long fab1 = 0;
        long fab2 = 1;

        if (number == 0) {
            System.out.println(fab1);
        } else if (number == 1) {
            System.out.println(fab2);
        }
        if (number >=2) {
            for (int i = 0; i < number; i++) {
                fab1 = fab1 + fab2;
                fab2 = fab1 - fab2;
                if (i == number - 1)
                    System.out.println(fab1);
            }
        }
    }


}
