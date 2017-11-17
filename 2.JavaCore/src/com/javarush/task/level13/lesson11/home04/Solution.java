package com.javarush.task.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(filename);

        while (true) {
            String temp = reader.readLine();
            if (temp.equals("exit")) {
                outputStream.write(temp.getBytes());
                break;
            }
            outputStream.write((temp + "\r\n").getBytes());
        }
        outputStream.close();
        reader.close();
    }
}
