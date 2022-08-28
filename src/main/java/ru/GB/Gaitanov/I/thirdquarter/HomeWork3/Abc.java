package ru.GB.Gaitanov.I.thirdquarter.HomeWork3;


public class Abc {

    public synchronized void ThreadA() {
        System.out.println("A");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }


    public void ThreadB() {
        System.out.println("B");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }

    public void ThreadC() {

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
                    Abc.ThreadA();
                }
            }).start();

            new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    Abc.ThreadB();
                }
            }).start();

            new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    Abc.ThreadC();
                }
            }).start();
        }
    }



