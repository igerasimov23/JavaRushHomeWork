package TempExamples;


public class RevertString {
    public static void main(String[] args) {

        String str = "field";
        String revert ="";
        for(int i =str.length()-1; i >=0; i--)
            revert += str.charAt(i);

        System.out.println(revert);
        System.out.println(str.length());
    }
}
