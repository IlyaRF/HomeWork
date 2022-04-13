package ru.GB.Gaitanov.I;

public class SixthTask {
    public static void main(String[] args) {

        CheckSumSign();
        Numbers();
        PrintColor();
        printThreeWords();
    }

    public static void CheckSumSign() {
        int a = -10;
        int b = 5;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void Numbers() {

        int a = 23;
        int b = 15;

        if (a >= b) {
            System.out.println("a >= b");

        } else {
            System.out.println("a < b");
        }
    }

    public static void PrintColor() {
        {
            int value = 101;

            if (value <= 0) {

                System.out.println("Красный");
            }
            if (value >= 1 && value <= 100) {

                System.out.println("Желтый");
            }
            if (value > 100)
                System.out.println("Зеленый");

        }
    }
        public static void printThreeWords() {
            {
                System.out.println("Orange");
                System.out.println("Banana");
                System.out.println("Apple");
            }
        }
        }


