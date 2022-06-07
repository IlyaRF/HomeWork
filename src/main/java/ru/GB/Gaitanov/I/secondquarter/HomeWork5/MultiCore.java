package ru.GB.Gaitanov.I.secondquarter.HomeWork5;

import java.util.Arrays;

public class MultiCore {
    public static void main(String[] args) {
        threads();
    }

    public static void threads() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                    / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");
        splitAndMergeExample();

    }
    public static void splitAndMergeExample() {
        int[] initialArray = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(initialArray));
        int[] leftHalf = new int[3];
        int[] rightHalf = new int[3];
        System.arraycopy(initialArray, 0, leftHalf, 0, 3);
        System.arraycopy(initialArray, 3, rightHalf, 0, 3);
        System.out.println(Arrays.toString(leftHalf));
        System.out.println(Arrays.toString(rightHalf));
        int[] mergedArray = new int[6];
        System.arraycopy(leftHalf, 0, mergedArray, 0, 3);
        System.arraycopy(rightHalf, 0, mergedArray, 3, 3);
        System.out.println(Arrays.toString(mergedArray));
    }
}
