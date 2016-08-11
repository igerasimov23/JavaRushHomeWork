package TempExamples;

import com.javarush.test.level15.lesson12.home07.Constants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Constants.FILE_NAME));
            try {
                String line = reader.readLine();
                while(line != null){
                    lines.add(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {




        System.out.println(lines);
    }
}
