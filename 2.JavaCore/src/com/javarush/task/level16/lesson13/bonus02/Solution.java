package com.javarush.task.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static {
        threads.add(new First());
        threads.add(new Second());
        threads.add(new Third());
        threads.add(new Fourth());
        threads.add(new Fifth());
    }

/*    public static void main(String[] args){

        Thread thread2 = threads.get(1);
        thread2.start();
        thread2.interrupt();

        Thread thread4 = threads.get(3);
        thread4.start();
        Message mes = (Message) thread4;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mes.showWarning();
        System.out.println(thread4.isAlive());

        Thread thread5 = threads.get(4);
        thread5.start();

    } */

    public static class First extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class Second extends Thread {
        @Override
        public void run() {
            try  {
                while (true) {
                    sleep(1);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Third extends Thread {
        @Override
        public void run() {
            try  {
                while (true) {
                    System.out.println("Ура");
                    sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }


    }
    public static class Fourth extends Thread implements Message{
        public void showWarning(){

            try{
                interrupt();
                join();
            } catch (Exception e){}
        }
        public void run(){
            while (!isInterrupted()){

            }
        }
    }
    public static class Fifth extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            try {
                while (true) {
                    String str = reader.readLine();
                    if (!str.equals("N")) {
                        sum += Integer.parseInt(str);
                    } else {
                        throw new InterruptedException();
                    }
                }
                } catch(IOException e){

                } catch(InterruptedException e){
                    System.out.println(sum);
                } catch (NumberFormatException e) {

            }
        }
    }
}
