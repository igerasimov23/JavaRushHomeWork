package Interview;


public class ReverseSentence {
    public static void main(String[] args) {

        String text = "The first non repeated character is";

        String[] textArray = text.split(" ");

        for (int i = 0; i < textArray.length; i++) {
           String str = textArray[i];
            String temp ="";

            for (int j = str.length()-1; j >=0; j--) {
                temp = temp + str.charAt(j);
            }
            temp += " ";
            textArray[i] = temp;
        }



        for(String s : textArray)
        System.out.print(s);
    }
}
