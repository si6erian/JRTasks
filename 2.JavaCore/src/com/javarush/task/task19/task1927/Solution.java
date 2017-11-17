package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consolePrint = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream psw = new PrintStreamWrapper(new PrintStream(outputStream));
        System.setOut(psw);
        testString.printSomething();
        System.setOut(consolePrint);
        System.out.println(outputStream.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }

    public static class PrintStreamWrapper extends PrintStream {
        private PrintStream printStream;
        private boolean f = false;

        public PrintStreamWrapper(PrintStream printStream) {
            super(printStream);
            this.printStream = printStream;
        }

        public void print(String s) {
            if (f) {
                printStream.print(s + "\nJavaRush - курсы Java онлайн");
            } else {
                printStream.print(s);
            }
            f = !f;
        }
    }

}
