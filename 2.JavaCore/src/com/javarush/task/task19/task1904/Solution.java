package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements  PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            if (fileScanner.hasNext()) {
                String[] str = fileScanner.nextLine().split(" ");
                Calendar cal = new GregorianCalendar(Integer.parseInt(str[5]),Integer.parseInt(str[4]) - 1,Integer.parseInt(str[3]));
                Date date = cal.getTime();
                person = new Person(str[1],str[2],str[0],date);
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
