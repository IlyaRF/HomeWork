package ru.GB.Gaitanov.I.thirdquarter.HomeWork3;


public class Abc {

    public synchronized void threadA() {
        System.out.println("A");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }


    public synchronized void threadB() {
        System.out.println("B");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }

    public synchronized void threadC() {

        System.out.println("C");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}

    class ABCStart {
        public static void main(String[] args) {
            Abc text = new Abc();

            new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    Abc.threadA();
                }
            }).start();

            new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    Abc.threadB();
                }
            }).start();

            new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    Abc.threadC();
                }
            }).start();
        }
    }



