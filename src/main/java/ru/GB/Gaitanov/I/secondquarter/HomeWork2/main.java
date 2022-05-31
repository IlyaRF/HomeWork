package ru.GB.Gaitanov.I.secondquarter.HomeWork2;


public class main {


    public static void main(String args[]) {

        int[][] numbers = new int[4][4];
        numbers[2][1] = 5;
        numbers[1][0] = 3;
        numbers[3][3] = 8;
        numbers[2][2] = 4;
        MyArraySizeException(numbers);


    }


    public static void MyArrayDataExeption(int[][] numbers) {

        try {
            // numbers [3][3] = Integer.parseInt("v");
            for (int i = 0; i < numbers.length; i++)
                Integer.parseInt(String.valueOf(numbers[i][i]));
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    sum += numbers[i][j];
                }
            }
            System.out.println(sum);
            System.out.println("Массив не содержит символы");

        } catch (IllegalArgumentException e) {
            System.out.println("Массив содержит символы");
        }
    }


    public static void MyArraySizeException(int[][] numbers) {

        try {
            numbers[3][3] = 4;
            System.out.println("Размер массива соответсвует требованиям");
            MyArrayDataExeption(numbers);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Размер массива не соответсвует требованиям");
        }
    }
}







