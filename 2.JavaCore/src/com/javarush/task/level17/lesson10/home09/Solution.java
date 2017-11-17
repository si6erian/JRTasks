package com.javarush.task.level17.lesson10.home09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String line;
        try {
            String first_file = reader.readLine();
            String second_file = reader.readLine();
            reader.close();
            BufferedReader input = new BufferedReader( new FileReader(first_file));
            while ((line = input.readLine()) != null) {
                allLines.add( line );
            }
            input.close();
            input = new BufferedReader( new FileReader(second_file));
            while ((line = input.readLine()) != null) {
                forRemoveLines.add( line );
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

    }

    public void joinData() throws CorruptedDataException {
        int numRemoved = 0;
        for (String rem: forRemoveLines) {
            if (allLines.contains( rem )) {
                allLines.remove( rem );
                numRemoved++;
            }
        }
        if (numRemoved != forRemoveLines.size()) {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
