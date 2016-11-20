package TempExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ilya on 9/25/2016.
 */
public class HomeExam {
    public static void main(String[] args) {
        System.out.println(listMissingLetters("Four score and seven yers ago"));

    }

    public static String listMissingLetters(String s) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        List<Character> listAlphabet = new LinkedList<>();
        for (Character c : alphabet) {
            listAlphabet.add(c);
        }

        List<Character> listAlp1 = new ArrayList<>();
        for (Character c : alphabet) {
            listAlp1.add(c);
        }
// replacing non alphabet
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z]", "");
        char[] ourString = s.toCharArray();

        for (int i = 0; i < listAlphabet.size(); i++) {
            for (int j = 0; j < ourString.length; j++) {
                char c = listAlphabet.get(i);
                if (c == ourString[j]) {
                  for(int m =0 ; m < listAlp1.size();m++){
                      if(listAlp1.get(m) ==c ){
                          listAlp1.remove(m);
                          break;
                      }
                  }
                    break;
                }
            }

        }

        // to String Character list
        StringBuilder sb = new StringBuilder(listAlp1.size());
        for (char c : listAlp1)
            sb.append(c);
        String result = sb.toString();


        return result;
    }
}
