package ru.GB.Gaitanov.I.thirdquarter.HomeWork3;


public class Abc {

        static final Object object = new Object();
        static String currentLetter = "A";

        public static void main(String[] args) {
            new Thread(() -> {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (object) {
                            while (!currentLetter.equals("A")) {
                                object.wait();
                            }
                            System.out.print(currentLetter);
                            currentLetter = "B";
                            object.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(() -> {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (object) {
                            while (!currentLetter.equals("B")) {
                                object.wait();
                            }
                            System.out.print(currentLetter);
                            currentLetter = "C";
                            object.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(() -> {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (object) {
                            while (!currentLetter.equals("C")) {
                                object.wait();
                            }
                            System.out.print(currentLetter);
                            currentLetter = "A";
                            object.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

