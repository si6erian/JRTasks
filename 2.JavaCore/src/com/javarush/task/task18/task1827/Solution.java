package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;

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
            System.out.println(str);
        }
        is.close();

        if (args.length == 4 && args[0].equals("-c")) {
            int max = -1;
            for (String x : list) {
                int id = Integer.parseInt(x.substring(0,8).trim());
                if (id > max)
                    max = id;
            }

            str = String.format("%-8d%-30s%-8s%-4s",  max+1, args[1], args[2], args[3]);
            list.add(str);
        }

        BufferedWriter os = new BufferedWriter(new FileWriter(filename));
        for (String x : list) {
            os.write(x);
            os.newLine();
        }
        os.close();

    }
}
