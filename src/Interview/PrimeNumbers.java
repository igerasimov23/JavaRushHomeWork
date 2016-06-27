package Interview;


public class PrimeNumbers {

    public static boolean isPrime(int primeNumber){
        if (primeNumber <= 1)
            return false;
        if (primeNumber == 2)
            return true;
        if (primeNumber %2 ==0)
            return false;
        for(int i = 2; i < primeNumber; i++){
            if(primeNumber %i == 0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {

        int max = 100;
        for (int i = 0; i < max; i++) {
            if(isPrime(i))
                System.out.println(i);
        }

    }

}
