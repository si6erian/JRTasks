package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception{
        //start here - начни тут
        if (args.length >= 2)
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        userC(args);
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        userU(args);
                    }
                    break;
                case "-d":
                    synchronized (allPeople) {
                        userD(args);
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                        userI(args);
                    }
                    break;
            }
    }

    public static void userC(String[] args) throws Exception{
        int i = 1;
        while (i < args.length) {
            String name = args[i];
            i++;
            if (args[i].equals("м")) {
                Date bd = new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 1]);
                allPeople.add(Person.createMale(name, bd));
                System.out.println(allPeople.size() - 1);
                //проверка System.out.println(allPeople.get(allPeople.size() - 1).getName() + " " + allPeople.get(allPeople.size() - 1).getSex() + " " + new SimpleDateFormat("dd/MM/yyyy").format(allPeople.get(allPeople.size() - 1).getBirthDay()));

            } else if (args[i].equals("ж")) {
                Date bd = new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 1]);
                allPeople.add(Person.createFemale(name, bd));
                System.out.println(allPeople.size() - 1);
                //проверка System.out.println(allPeople.get(allPeople.size() - 1).getName() + " " + allPeople.get(allPeople.size() - 1).getSex() + " " + new SimpleDateFormat("dd/MM/yyyy").format(allPeople.get(allPeople.size() - 1).getBirthDay()));
            }
            i = i + 2;
        }
    }

    public static void userU(String[] args) throws Exception{
        int i = 2;
        while (i < args.length) {
            String name = args[i];
            int id = Integer.parseInt(args[i - 1]);
            i++;
            if (id < allPeople.size()) {
                if (args[i].equals("м")) {
                    Date bd = new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 1]);
                    allPeople.get(id).setSex(Sex.MALE);
                    allPeople.get(id).setName(name);
                    allPeople.get(id).setBirthDay(bd);
                    //проверка System.out.println(allPeople.get(id).getName() + " " + allPeople.get(id).getSex() + " " + new SimpleDateFormat("dd/MM/yyyy").format(allPeople.get(id).getBirthDay()));

                } else if (args[i].equals("ж")) {
                    Date bd = new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 1]);
                    allPeople.get(id).setSex(Sex.FEMALE);
                    allPeople.get(id).setName(name);
                    allPeople.get(id).setBirthDay(bd);
                    //проверка System.out.println(allPeople.get(id).getName() + " " + allPeople.get(id).getSex() + " " + new SimpleDateFormat("dd/MM/yyyy").format(allPeople.get(id).getBirthDay()));
                }
            }
            i = i + 3;
        }
    }

    public static void userD(String[] args) throws Exception{
        for (int i = 1; i < args.length; i++) {
            int id = Integer.parseInt(args[i]);
            if (id < allPeople.size()) {
                Person pers = allPeople.get(id);
                pers.setName(null);
                pers.setSex(null);
                pers.setBirthDay(null);
            }
            // проверка if ((allPeople.size() - 1) > 0) System.out.println(allPeople.get(allPeople.size() - 1).getName() + " " + allPeople.get(allPeople.size() - 1).getSex() + " " + new SimpleDateFormat("dd/MM/yyyy").format(allPeople.get(allPeople.size() - 1).getBirthDay()));

        }
    }

    public static void userI(String[] args) {
        for (int i = 1; i < args.length; i++) {
            int id = Integer.parseInt(args[i]);
            if (id < allPeople.size()) {
                String sexstring = null;
                if (allPeople.get(id).getSex().equals(Sex.MALE))
                    sexstring = "м";
                else if (allPeople.get(id).getSex().equals(Sex.FEMALE))
                    sexstring = "ж";
                System.out.println(allPeople.get(id).getName() + " " + sexstring + " " + new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(id).getBirthDay()));
            }
        }
    }
}
