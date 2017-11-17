package com.javarush.task.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream;
        while (true){
            try{
                fileInputStream = new FileInputStream(reader.readLine());
                if (fileInputStream.available() > 0) break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");
            }
        }
        while (fileInputStream.available() > 0)
            System.out.print((char) fileInputStream.read());
        fileInputStream.close();
    }
}
