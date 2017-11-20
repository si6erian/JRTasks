package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("2002-",".txt", new File("/home/dl/Dropbox/DINS/java/"));
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            SimpleDateFormat format = new SimpleDateFormat("yyyy MM dd");
            for (int i = 1; i <= 10; i++) {
                User user = new User();
                user.setFirstName("FirstName" + i);
                user.setLastName("LastName" + i);
                user.setBirthDate(format.parse("1999 10 " + 10 + i));
                user.setMale((i%2 == 0));
                user.setCountry(User.Country.RUSSIA);
                javaRush.users.add(user);
            }
            javaRush.save(outputStream);
            outputStream.flush();

            for (User u : javaRush.users) {
                System.out.println(u.getFirstName() + " " + u.getLastName() + " " + u.isMale() + " " + u.getCountry().getDisplayedName() + " " + u.getBirthDate());
            }
            System.out.println(javaRush.users.size());

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            for (User u : loadedObject.users) {
                System.out.println(u.getFirstName() + " " + u.getLastName() + " " + u.isMale() + " " + u.getCountry().getDisplayedName() + " " + u.getBirthDate());
            }

            System.out.println(loadedObject.equals(javaRush));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
            writer.println(users.size() > 0);
            for ( User x : users) {
                writer.println(x.getFirstName());
                writer.println(x.getLastName());
                writer.println(format.format(x.getBirthDate()));
                writer.println(x.isMale());
                writer.println(x.getCountry());
            }
            writer.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
            User user = null;
            String areUsersExist = reader.readLine();
            if (areUsersExist.equals("true")) {
                while (reader.ready()) {
                    user = new User();
                    user.setFirstName(reader.readLine());
                    user.setLastName(reader.readLine());
                    user.setBirthDate(format.parse(reader.readLine()));
                    user.setMale(Boolean.parseBoolean(reader.readLine()));
                    user.setCountry(User.Country.valueOf(reader.readLine()));
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
