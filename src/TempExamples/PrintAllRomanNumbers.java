package TempExamples;


public class PrintAllRomanNumbers {


    public static void main(String[] args)   {



    String str = "should work for I I  XX  VVIII the year the Corvette Stingray was   introduced ";

        String [] myArray = str.split(" ");
        for(String s : myArray){
            if(isRoman(s))
                System.out.println(convert(s));
        }

    }


    public static boolean isRoman(String str) {
        String [] myArray = str.split(" ");
        for(String s : myArray) {
            if(s.length() == 1){
                if (s == "I" ){
                    return false;
                }
            }
            if (s.length() > 1) {
                if (Character.isUpperCase(s.charAt(1))) {
                    return true;
                }
            }
        }
        return false;
    }


    public static int convert(String romNumber) {
        int result = 0;


        for (int x = 0; x < romNumber.length(); x++) {
            char convert = romNumber.charAt(x);

            switch (convert) {
                case 'M':
                    result += 1000;
                    break;

                case 'D':
                    result += 500;
                    break;

                case 'C':
                    result += 100;
                    break;

                case 'L':
                    result += 50;
                    break;

                case 'X':
                    result += 10;
                    break;

                case 'V':
                    result += 5;
                    break;

                case 'I':
                    result += 1;
                    break;

            }
        }
        if (romNumber.contains("IV")) {
            result -= 2;
        }
        if (romNumber.contains("IX")) {
            result -= 2;
        }
        if (romNumber.contains("XL")) {
            result -= 20;
        }
        if (romNumber.contains("XC")) {
            result -= 20;
        }
        if (romNumber.contains("CD")) {
            result -= 200;
        }
        if (romNumber.contains("CM")) {
            result -= 200;
        }
        return result;
    }


}
