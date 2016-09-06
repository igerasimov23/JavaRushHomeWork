package com.javarush.test.level19.lesson03.task04;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке.
Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("text.txt"));
        PersonScannerAdapter adapter = new PersonScannerAdapter(s);
        System.out.println(adapter.read());
        adapter.close();
    }
    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner scanner;

        PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException {

            if (scanner.hasNext()) {
                String[] array = scanner.nextLine().split(" ");
                String firstName = array[1];
                String middleName = array[2];
                String lastName = array[0];
                Calendar calendar = new GregorianCalendar(Integer.parseInt(array[5]),Integer.parseInt(array[4]) -1, Integer.parseInt(array[3]));
                Date birthDate = calendar.getTime();
                Date birthDate1 = (new GregorianCalendar(Integer.parseInt(array[5]),Integer.parseInt(array[4]) - 1, Integer.parseInt(array[3]))).getTime();
                System.out.println(new Person(firstName, middleName, lastName, birthDate1));


               return  new Person(firstName, middleName, lastName, birthDate);
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            scanner.close();
        }
    }
}
