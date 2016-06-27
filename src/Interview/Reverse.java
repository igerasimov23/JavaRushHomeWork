package Interview;


public class Reverse {

    public static int reverse(int num){

        String strNumber = String.valueOf(num);
        String myStr = "";

        for (int i = strNumber.length()-1; i >=0 ; i--) {
            myStr = myStr + strNumber.charAt(i);
        }
        return Integer.valueOf(myStr);
    }

    public static int reverseStringBuffer (int num) {
        String strNumber = String.valueOf(num);
        StringBuffer stringBuffer = new StringBuffer(strNumber);
        strNumber = stringBuffer.reverse().toString();

        return Integer.parseInt(strNumber);
    }




    public static void main(String[] args) {

        System.out.println(reverse(12345));
        System.out.println(reverseStringBuffer(56789));
    }

}
