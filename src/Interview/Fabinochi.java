package Interview;


public class Fabinochi {

    public static void main(String[] args) {

        long fab1 = 0;
        long fab2 = 1;
        for (int i = 0; i < 90; i++) {
            fab1 = fab1 + fab2;
            fab2 = fab1 - fab2;
            System.out.println(fab1);
        }





    }








}
