package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    private Properties ppts = new Properties();
    private String fileName;


    public void fillInPropertiesMap() {
        //implement this method - реализуйте этот метод
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            fileName = reader.readLine();
            reader.close();
            InputStream inputStream = new FileInputStream(fileName);

            load(inputStream);
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        ppts.clear();
        for (Map.Entry<String, String> pair : properties.entrySet()) {
            ppts.put(pair.getKey(),pair.getValue());
        }
        ppts.store(outputStream,"");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        ppts.load(inputStream);
        for (Map.Entry<Object, Object> pair: ppts.entrySet()) {
            String key = pair.getKey().toString();
            String value = pair.getValue().toString();
            properties.put(key,value);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.fillInPropertiesMap();
        try {
            OutputStream outputStream = new FileOutputStream(solution.fileName);
            solution.save(outputStream);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
