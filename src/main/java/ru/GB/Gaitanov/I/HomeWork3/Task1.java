package ru.GB.Gaitanov.I.HomeWork3;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 1;
        arr[4] = 1;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }

}

