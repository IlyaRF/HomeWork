package ru.GB.Gaitanov.I.firstquarter.HomeWork3;

public class Task7 {

    public static void main(String[] args) {


        int arr[] = {10,5,50,2,4,8,9,16,10,0};

        System.out.println(checkBalance(arr));

    }

    public static boolean checkBalance(int arr []) {
        int a = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        int b = arr[5] + arr[6] + arr[7] + arr[8] + arr[9];
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }
}


