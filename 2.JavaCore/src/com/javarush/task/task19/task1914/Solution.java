package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        int result;
        String[] s = outputStream.toString().split("\\p{Space}");
        if (s[1].equals("+")) {
            result = Integer.valueOf(s[0]) + Integer.valueOf(s[2]);
        } else if (s[1].equals("-")) {
            result = Integer.valueOf(s[0]) - Integer.valueOf(s[2]);
        } else {
            result = Integer.valueOf(s[0]) * Integer.valueOf(s[2]);
        }
        System.out.print(outputStream.toString() + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

