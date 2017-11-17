package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();

        BufferedReader is = new BufferedReader(new FileReader(filename));
        String str;
        while ((str = is.readLine()) != null) {
            list.add(str);
        }
        is.close();

        if (args.length > 4 && args[0].equals("-u")) {
            for (String x : list) {
                if (args[1].equals(x.substring(0, 8).split(" ")[0])) {
                    String newline = String.format("%-8.8s%-30.30s%-8.8s%-4.4s", args[1], args[2], args[3], args[4]);
                    list.set(list.indexOf(x), newline);
                }
            }
        }

        if (args.length > 1 && args[0].equals("-d")) {
            for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
                if (args[1].equals(iterator.next().substring(0, 8).split(" ")[0])) {
                    iterator.remove();
                }
            }
        }

        BufferedWriter os = new BufferedWriter(new FileWriter(filename));
        for (String x : list) {
            os.write(x);
            os.newLine();
        }
        os.close();
    }
}
