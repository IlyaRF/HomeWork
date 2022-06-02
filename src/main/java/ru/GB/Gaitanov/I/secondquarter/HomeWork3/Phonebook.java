package ru.GB.Gaitanov.I.secondquarter.HomeWork3;

import java.util.HashMap;
import java.util.Map;


public class Phonebook {

    static HashMap<String, Long> phonebook = new HashMap<>();

    public static void main(String[] args) {

        add("Petrov", 89999990000L);


    }

    public static void add(String name, Long number) {
        for (Map.Entry<String, Long> o : phonebook.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());


        }
    }
}

