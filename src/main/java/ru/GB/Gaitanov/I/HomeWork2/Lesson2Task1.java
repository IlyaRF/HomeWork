package ru.GB.Gaitanov.I.HomeWork2;

public class Lesson2Task1 {
    public static void main(String[] args) {

        System.out.println(within10and20(5, 6));
        ;
    }
    public static boolean within10and20(int a, int b) {

        if (a + b > 10 && a + b < 20) {
            return true;
        }
        if (a + b < 10 || a + b > 20) {
            return false;
        }
        return false;
    }
}




