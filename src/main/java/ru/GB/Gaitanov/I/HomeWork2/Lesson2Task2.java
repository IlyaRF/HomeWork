package ru.GB.Gaitanov.I.HomeWork2;

public class Lesson2Task2 {
    public static void main(String[] args) {
        System.out.println(PlusOrMinus(-1));


    }

    public static String PlusOrMinus(int a) {

        if (a >= 0) {
            return ("Число положительное");
        } else {
            return ("Число отрицательное");
        }
    }
}
