package ru.GB.Gaitanov.I.HomeWork1;

public class printColor {
    public static void main(String[] args) {
        PrintColor();
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

    }
