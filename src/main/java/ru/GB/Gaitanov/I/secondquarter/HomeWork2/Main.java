package ru.GB.Gaitanov.I.secondquarter.HomeWork2;


public class Main {


    public static void main(String[] args) {

        String[][] number = new String[][]{{"1", "2", "3", "4", }, {"5", "6", "7", "8"}, {"9", "0", "9", "8"}, {"7", "6", "5", "4"}};
        try {
            try {
                int result = check(number);
                System.out.println("Сумма массива чисел " + result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не соответсвует требованиям");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("В массиве символ: "+ e.i + "x" + e.j );

        }
    }

    private static int check(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
    private static class MyArraySizeException extends Exception {
    }
    private static class MyArrayDataException extends Exception {
        private final int i;
        private final int j;

        MyArrayDataException(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

}
