package TempExamples;

import java.io.IOException;
import java.text.ParseException;

public class Temp {
    public static void main(String[] args) throws IOException, ParseException {
    String phone = "+38(050)123-45-67";
//        phone = phone.replaceAll("-","");
        phone = phone.replaceAll("[()-]","");
        System.out.println(phone);
    }


}
