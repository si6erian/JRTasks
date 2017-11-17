package com.javarush.task.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        Thread td = new Thread(new TestThread());
        td.start();
        td.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        public void run() {
                while (!Thread.currentThread().isInterrupted()) {

                }
        }
    }
}
