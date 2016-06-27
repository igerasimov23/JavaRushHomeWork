package Interview;

import java.math.BigInteger;


public class FabonachiBig {
    public static void main(String[] args) {
        int max = 100;

        BigInteger[] fab = new BigInteger[max];
        fab[0] = BigInteger.ZERO;
        fab[1] = BigInteger.ONE;

        for (int i = 2; i < max; i++) {
            fab[i] = fab[i-2].add(fab[i-1]);
            System.out.println(fab[i]);
        }






    }
}
