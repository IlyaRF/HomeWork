package ru.GB.Gaitanov.I.HomeWork3;

public class Task3 {
    public static void main(String[] args) {

            int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 6) {
                    arr[i] = arr[i]*2;
                } else {
                    arr[i] = arr[i] ;
                }
                System.out.println(arr[i]);
            }
        }

    }

