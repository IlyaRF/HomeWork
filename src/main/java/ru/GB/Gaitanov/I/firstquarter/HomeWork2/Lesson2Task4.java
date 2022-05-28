package ru.GB.Gaitanov.I.firstquarter.HomeWork2;

public class Lesson2Task4 {

    public static void main(String[] args) {

        System.out.println(Print(10,"С Новым Годом!"));
    }

    public static String Print(int a, String b) {
        for (int i = 0; i < a-1; i++) {
            {
                System.out.print(b);
            }
            System.out.println();

        }
        return b;
    }
}