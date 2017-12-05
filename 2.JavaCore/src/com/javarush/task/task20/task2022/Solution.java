package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Solution solution1 = new Solution("/home/dl/Dropbox/DINS/java/2022");
        solution1.writeObject("Переопределение сериализации в потоке, до");

        ByteArrayOutputStream buf1 = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buf1);

        out.writeObject(solution1);

        ByteArrayInputStream buf2 = new ByteArrayInputStream(buf1.toByteArray());
        ObjectInputStream in = new ObjectInputStream(buf2);

        Solution solution2 = (Solution) in.readObject();
        solution2.writeObject("Переопределение сериализации в потоке, после");

    }
}
