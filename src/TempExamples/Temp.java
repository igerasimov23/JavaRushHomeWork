package TempExamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Temp {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

        String inputString = "01:30";

        Date date = sdf.parse(inputString);
        System.out.println("in milliseconds: " + date.getTime());
    }
}
