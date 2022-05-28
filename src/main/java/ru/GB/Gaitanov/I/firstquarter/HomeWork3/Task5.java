package ru.GB.Gaitanov.I.firstquarter.HomeWork3;

public class Task5 {
    public static void main(String args[]) {

        System.out.print(arr(4, 6));
    }

    public static int arr(int len, int initialValue) {

        int arr[] = new int[len];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = initialValue;

            System.out.print(arr[i]);
        }
            return initialValue;
        }
    }






