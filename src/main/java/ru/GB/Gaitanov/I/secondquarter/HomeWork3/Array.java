package ru.GB.Gaitanov.I.secondquarter.HomeWork3;

import java.util.ArrayList;
import java.util.HashSet;

public class Array {


    public static void main(String[] args) {

        final ArrayList<String> arrays = new ArrayList<>();
        arrays.add("мама");
        arrays.add("раму");
        arrays.add("мыла");
        arrays.add("раму");
        arrays.add("мама");
        arrays.add("весна");
        arrays.add("лето");
        arrays.add("зима");
        arrays.add("осень");
        arrays.add("дождь");
        arrays.add("солнечно");
        arrays.add("град");
        arrays.add("пасмурно");
        arrays.add("туманно");
        arrays.add("туманно");
        arrays.add("день");
        arrays.add("месяц");
        arrays.add("год");
        arrays.add("зима");
        arrays.add("туманно");


      /*  "мыла", "раму", "мыла", "раму", "мама", "весна", "лето", "зима", "осень",
                        "снег", "дождь", "солнечно", "град", "пасмурно", "туманно", "день", "месяц", "год", "туманно", "зима");*/

        HashSet<String> check = new HashSet<>(arrays);
        System.out.println(check);
        System.out.println("В массиве уникальных значений: " + check.size() +" из " + arrays.size());

    }
}
