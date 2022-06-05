package ru.GB.Gaitanov.I.secondquarter.HomeWork3;

import java.util.*;


public class Phonebook {
    static HashMap<String, String> phonebook = new HashMap<>();

    public static void main(String[] args) {

        add("Ivanov", "8947646021");
        add("Smirnov", "8999906022");
        add("Sidorov", "8999945023");
        get("Ivanov");
        get("Smirnov");
        get("dsdsd");

    }

    public static void add(String surname, String number) {
        phonebook.put(surname, number);

    }

    public static void get(String surname) {
        if (phonebook.containsKey(surname)) {
            Set<Map.Entry<String, String>> set = phonebook.entrySet();
            for (Map.Entry<String, String> temp : set) {
                if (temp.getKey().equals(surname)) {
                    System.out.println(temp.getKey() + " : " + temp.getValue());
                }
            }
        } else {
            System.out.println("Нет в базе");
        }
    }
}


