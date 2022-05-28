package ru.GB.Gaitanov.I.firstquarter.HomeWork3;

public class Task4 {
    public static void main(String[] args) {

        int N = 4;
        int arr[][] = new int[4][4];

        for (int i = 0; i < N; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)

                System.out.printf("%3d",arr[i][j]);
                System.out.println();
            }
        }
    }






