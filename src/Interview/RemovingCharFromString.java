package Interview;


import java.util.ArrayList;

public class RemovingCharFromString {

    public static void main(String[] args) {

        String str = "PriumeNumbers";
        ArrayList<Character> charList = new ArrayList<Character>();
        for(int i = 0; i<str.length();i++){
            charList.add(str.charAt(i));
        }

        for (int i = 0; i < charList.size(); i++) {
            if (charList.get(i) == 'u'){
                charList.remove(i);
            }
        }
        String s = charList.toString();
        System.out.println(s);




    }

}
