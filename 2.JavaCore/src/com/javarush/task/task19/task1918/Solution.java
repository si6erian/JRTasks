package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        StringBuilder sb = new StringBuilder("");
        while (file.ready()) {
            String s = file.readLine();
            if (!s.endsWith(">")) {
                sb.append(s).append(System.lineSeparator());
            } else {
                sb.append(s);
            }
        }
        file.close();
        String arg = args[0];

        String str = sb.toString();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        String[] separatedData = str.split("<" + arg);
        StringBuilder build = new StringBuilder();
        // need to think about logic of counting of embedded tegs
        for (int i = 1; i < separatedData.length; i++) {
            String s = "<" + arg + separatedData[i];
            separatedData[i] = s;
            if (separatedData[i].startsWith("<" + arg + " ") || separatedData[i].startsWith("<" + arg + ">") || separatedData[i].startsWith("<" + arg + System.lineSeparator())) {
                if (separatedData[i].endsWith("</" + arg + ">")) {
                    build.append(separatedData[i]);
                    list.add(build.toString());
                    build = new StringBuilder();
                } else if (separatedData[i].contains("</" + arg + ">")) {
                    String[] temp = separatedData[i].split("</" + arg + ">");
                    build.append(temp[0]).append("</").append(arg).append(">");
                    list.add(build.toString());
                    build = new StringBuilder();
                } else {
                        build.append(separatedData[i]);
                }
            }
        }

        for (String s: list) {
            String[] temp = s.split("<" + arg);
            if (temp.length > 2) {
                for (int i = 2; i < temp.length; i++) {
                    String st = "<" + arg + temp[i];
                    list1.add(s.replaceAll("\n", " "));
                    list1.add(st.replaceAll("\n", " ").split("</" + arg + ">")[temp.length - 1 - i] + "</" + arg + ">");
                }
            } else {
                list1.add(s.replaceAll("\n", " "));
            }
        }

        for (String x: list1)
            System.out.println(x);

    }
}


