package ru.GB.Gaitanov.I.firstquarter.HomeWork3;


public class Task6 {

    public static void main(String[] args) {


        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = -6;
        arr[3] = 8;
        arr[4] = 7;

        if (arr[0] > arr[1] && arr[0] > arr[2] && arr[0] > arr[3] && arr[0] > arr[4]) {
            System.out.println("arr[0] больше всех");

        } else if  (arr[1] > arr[0] && arr[1] > arr[2] && arr[1] > arr[3] && arr[1] > arr[4]) {
                System.out.println("arr[1] больше всех");

            } else if (arr[2] > arr[0] && arr[2] > arr[1] && arr[2] > arr[3] && arr[0] > arr[4]) {
                    System.out.println("arr[2] больше всех");

                } else if  (arr[3] > arr[0] && arr[3] > arr[1] && arr[3] > arr[2] && arr[3] > arr[4]) {
                        System.out.println("arr[3] больше всех");

                    } else {
                            System.out.println("arr[4] больше всех");
        }
    }

}
