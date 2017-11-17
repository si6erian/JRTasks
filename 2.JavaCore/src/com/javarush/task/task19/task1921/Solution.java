package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        ArrayList<String> list = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");

        while (file.ready()) {
            list.add(file.readLine());
        }
        file.close();

        for (String s : list) {
            String[] str = s.split( " ");
            String dateString = str[str.length - 3] + " " + str[str.length - 2] + " " + str[str.length - 1];
            StringBuilder name = new StringBuilder();
            for (int i = 0; i < str.length - 3; i++) {
                name.append(str[i]);
                if (i < str.length - 4) {
                    name.append(" ");
                }
            }
            PEOPLE.add(new Person(name.toString(),format.parse(dateString)));
        }
        for (Person x: PEOPLE) {
            System.out.print(x.getName() + " ");
            System.out.println(format.format(x.getBirthday()));
        }
    }
}

