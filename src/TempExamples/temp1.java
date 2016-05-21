package TempExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static TempExamples.Consts.*;

/**
 * Created by Ilya on 1/23/2016.
 */
public class temp1 {




    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        String temp = PERIOD;
        String exit = reader.readLine();
        while (true) {
            if(exit.length() == 0)
                System.exit(0);

            if (exit.contains(" ")) {
                break;}
                int a = Integer.parseInt(reader.readLine());
                list.add(a);

        }
    }
}
