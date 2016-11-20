package TempExamples;

/**
 * Created by Ilya on 9/25/2016.
 */
public class HomeExam2 {
    public static void main(String[] args) {
        explode("B.B.B.BB.", 2);
    }

    public static String[] explode(String bombs, int force) {


        char[] filed = bombs.toCharArray();
        //should between 1-50
        if(filed.length == 0 || filed.length > 51)
          return null;

//          only '.' or 'B'
        for (int i = 0; i < bombs.length(); i++) {
           if(bombs.charAt(i) != '.' && bombs.charAt(i) != 'B')
               return null;

        }

//        force should be between 1 and 10
        if(force == 0 || force > 10)
            return null;
        System.out.println(filed);


//  first round: bomb blows
        char[] filed1 = new char[bombs.length()];
        for (int k = 0; k < bombs.length(); k++) {
            filed1[k] = '.';
        }

        for (int i = 0; i < filed.length; i++) {
            if (filed[i] == 'B') {

                try {
                    if (filed1[i - force] == '>') {
                        filed1[i - force] = 'X';
                    } else
                        filed1[i - force] = '<';
                } catch (Exception e) {
                }
                try {
                    if (filed1[i + force] == '<') {
                        filed1[i - force] = 'X';
                    } else
                        filed1[i + force] = '>';
                } catch (Exception e) {
                }

            }
        }
        System.out.println(filed1);

//        Bomb wave untill its gone
        while (isEmpty(filed1)){
            filed1 = attack(filed1, bombs, force);
        }



        return null;
    }

//    generating bomb wave 1 Step
    public static char[] attack(char[] beforeAttack, String bombs, int force) {
        char[] filed2 = new char[bombs.length()];
        for (int k = 0; k < bombs.length(); k++) {
            filed2[k] = '.';
        }


            for (int i = 0; i < beforeAttack.length; i++) {
                if (beforeAttack[i] == 'X') {
                    try {
                        if (filed2[i - force] == '>')
                            filed2[i - force] = 'X';
                        else if (filed2[i - force] == '.')
                            filed2[i - force] = '<';
                    } catch (Exception e) {
                    }
                    try {
                        filed2[i + force] = '>';
                    } catch (Exception e) {
                    }
                } else if (beforeAttack[i] == '<') {
                    try {
                        if (filed2[i - force] == '>') {
                            filed2[i - force] = 'X';
                        } else if (filed2[i - force] == '.')
                            filed2[i - force] = '<';
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }

                } else if (beforeAttack[i] == '>') {
                    try {
                        filed2[i + force] = '>';
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                }
            }
            System.out.println(filed2);



        return filed2;
    }

//    checking if bombs waves are gone(all equal to '.')
    public static boolean isEmpty(char[] array){
        boolean isEmpty = false;
        for(char c : array){
            if(c != '.' )
                isEmpty = true;
        }
        return isEmpty;
    }

}

