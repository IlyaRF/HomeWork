package ru.GB.Gaitanov.I.firstquarter.HomeWork1;

public class printColor {
    public static void main(String[] args) {
        PrintColor();
    }

    public static void PrintColor() {
        {
            int value = 99;

            if (value <= 0) {

                System.out.println("Красный");
            } else if (value >= 1 && value <= 100) {

                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");

            }
        }

    }
}
