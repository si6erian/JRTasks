package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter{
    private FileWriter fileWriter;

    public FileConsoleWriter(String s) throws IOException {
        this.fileWriter = new FileWriter(s);
    }

    public FileConsoleWriter(String s, boolean b) throws IOException {
        this.fileWriter = new FileWriter(s, b);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean b) throws IOException {
        this.fileWriter = new FileWriter(file, b);
    }

    public FileConsoleWriter(FileDescriptor fileDescriptor) {
        this.fileWriter = new FileWriter(fileDescriptor);
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(String.valueOf(c));
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        System.out.println(new String(cbuf).substring(off,off + len));
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));
    }

    public void close() throws IOException {
        fileWriter.close();
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.println(new String(cbuf));
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }

    public static void main(String[] args) {

    }

}
