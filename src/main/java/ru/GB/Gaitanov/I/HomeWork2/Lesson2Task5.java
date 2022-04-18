package ru.GB.Gaitanov.I.HomeWork2;

public class Lesson2Task5 {

    public static void main(String[] args) {

        System.out.println(Year(2000));

    }

    public static boolean Year(int a) {


        int year = a;
        int b = year % 4;
        int c = year % 100;
        int d = year % 400;
        if (b != 0) {
            return (false);
        } else if (c != 0) {
            return (true);
        } else if (d != 0) {
            return (false);
        } else
            return (true);

    }
}
