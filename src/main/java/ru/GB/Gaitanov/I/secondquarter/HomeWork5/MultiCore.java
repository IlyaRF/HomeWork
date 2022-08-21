package ru.GB.Gaitanov.I.secondquarter.HomeWork5;

import java.util.Arrays;


public class MultiCore {
    public static void main(String[] args) throws InterruptedException {
        threads();
        threadsTwo();
        threadsThree();
        threadsFour();


    }

    public static void threads() {
        int size = 10_000_000;
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");


    }

    public static void threadsTwo() throws InterruptedException {

        int size = 10_000_000;
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < size / 2; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            splitAndMergeExample();
        });
            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < size / 2; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println("Two thread time: " + (System.currentTimeMillis() -
                        startTime) + " ms.");
                splitAndMergeExample();
            });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        }

    public static void threadsThree() throws InterruptedException {

        int size = 10_000_000;
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < size / 3; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            splitAndMergeExample();

        });
        thread1.start();
        thread1.join();

    }
        public static void threadsFour() throws InterruptedException {

            int size = 10_000_000;
            float[] arr = new float[size];
            Arrays.fill(arr, 1.0f);
            long startTime = System.currentTimeMillis();
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < size / 4; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                splitAndMergeExample();
            });
            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < size / 4; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println("Four thread time: " + (System.currentTimeMillis() -
                        startTime) + " ms.");
                splitAndMergeExample();
            });
            Thread thread3 = new Thread(() -> {
                for (int i = 0; i < size / 4; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                splitAndMergeExample();
            });
            Thread thread4 = new Thread(() -> {
                for (int i = 0; i < size / 4; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                splitAndMergeExample();
            });
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
    }
        public static void splitAndMergeExample () {
            int[] initialArray = {1, 2, 3, 4, 5, 6};
            int[] leftHalf = new int[3];
            int[] rightHalf = new int[3];
            System.arraycopy(initialArray, 0, leftHalf, 0, 3);
            System.arraycopy(initialArray, 3, rightHalf, 0, 3);
            int[] mergedArray = new int[6];
            System.arraycopy(leftHalf, 0, mergedArray, 0, 3);
            System.arraycopy(rightHalf, 0, mergedArray, 3, 3);

        }
    }

