package TempExamples;


import java.util.ArrayList;

//Find a 1st non-repeated char in the string
//        for e.g. if string is "Salesforce is the best company to work for” returns 'l'
public class SalesForExam {
    public static void main(String[] args) {
        String str= "aasalesforsr";
        ArrayList<Character> list = new ArrayList<>();
        str = str.replace(" ", "");
        String newStr= str;
        for (int i =0; i< str.length()-1; i++) {
            boolean write =true;
            breakLopp:
            for (int j =0; j < str.length()-1; j++){
                if(str.charAt(i) == newStr.charAt(j)) {
//                    System.out.println(str.charAt(i));
//                    System.out.println(str.charAt(j));
                    write = false;
                    break breakLopp;
                }
            }
            if (write== true)
                list.add(str.charAt(i));


        }
        System.out.println(list);

    }
}

