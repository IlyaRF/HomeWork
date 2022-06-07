package ru.GB.Gaitanov.I.secondquarter.HomeWork5;

public class MultiCore2 {
        public static void main(String[] args) {
            threadsSecond();
        }
        public static void threadsSecond() {
            int size = 10_000_000;
            float[] arr = new float[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 1.0f;
            }
            long startTime = System.currentTimeMillis();
            System.out.println("Two thread time: " + (System.currentTimeMillis() -
                    startTime) + " ms.");
        }
    }


