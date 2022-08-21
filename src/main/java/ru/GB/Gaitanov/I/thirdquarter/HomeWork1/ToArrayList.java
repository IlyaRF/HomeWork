package ru.GB.Gaitanov.I.thirdquarter.HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToArrayList {

    public static void main(String[] args) {
        String[] arrayOfStrings = {"1", "2", "3", "4"};
        List<String> listOfStrings = new ArrayList<>();

        Collections.addAll(listOfStrings, arrayOfStrings);
        for (String str : listOfStrings)
            System.out.print(" " + str);

    }

}