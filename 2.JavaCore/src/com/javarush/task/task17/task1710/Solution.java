package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception{
        //start here - начни тут

        Person pers;
        Date bd;
        String name;
        int id;
        if (args.length >= 2 && args.length != 3) {
            if (args[0].equals("-c")) {
                name = args[1];
                for (int i = 2; i < args.length - 2; i++)
                    name = name + " " + args[i];
                bd = new SimpleDateFormat("dd/MM/yyyy").parse(args[args.length - 1]);
                if (args[args.length - 2].equals("м")) {
                    allPeople.add(Person.createMale(name, bd));
                    System.out.println(allPeople.size() - 1);
                } else if (args[args.length - 2].equals("ж")) {
                    allPeople.add(Person.createFemale(name, bd));
                    System.out.println(allPeople.size() - 1);
                }
            } else
                if (args[0].equals("-u")) {
                    id = Integer.parseInt(args[1]);
                    if (id < allPeople.size()) {
                        pers = allPeople.get(id);
                        name = args[2];
                        for (int i = 3; i < args.length - 2; i++) {
                            name = name + " " + args[i];
                        }
                        bd = new SimpleDateFormat("dd/MM/yyyy").parse(args[args.length - 1]);

                        if (args[args.length - 2].equals("м")) {
                            pers.setSex(Sex.MALE);
                            pers.setName(name);
                            pers.setBirthDay(bd);
                        } else if (args[args.length - 2].equals("ж")) {
                            pers.setSex(Sex.FEMALE);
                            pers.setName(name);
                            pers.setBirthDay(bd);
                        }
                        // проверка                         System.out.println(pers.getName() + " " + pers.getSex() + " " + new SimpleDateFormat("dd/MM/yyyy").format(pers.getBirthDay()));
                    }
                } else
                    if (args[0].equals("-d")) {
                        id = Integer.parseInt(args[1]);
                        if (id < allPeople.size()) {
                            pers = allPeople.get(Integer.parseInt(args[1]));
                            pers.setName(null);
                            pers.setSex(null);
                            pers.setBirthDay(null);
                        }
                } else
                    if (args[0].equals("-i")) {
                        id = Integer.parseInt(args[1]);
                        if (id < allPeople.size()) {
                            pers = allPeople.get(id);
                            String sexstring = null;
                            if (pers.getSex().equals(Sex.MALE))
                                sexstring = "м";
                            else if (pers.getSex().equals(Sex.FEMALE))
                                sexstring = "ж";
                            System.out.println(pers.getName() + " " + sexstring + " " + new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(pers.getBirthDay()));
                        }
                    }
        }
    }
}