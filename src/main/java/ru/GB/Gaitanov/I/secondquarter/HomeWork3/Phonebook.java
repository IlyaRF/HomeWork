package ru.GB.Gaitanov.I.secondquarter.HomeWork3;


import java.util.HashMap;


public class Phonebook {

    private static final HashMap<String, String> phonebook = new HashMap<>();


    private static void add(String name, String number) {
        phonebook.put(name, number);

    }

    public static void get(String name) {
        if (phonebook.containsKey(name))
            System.out.println(phonebook.get(name) + "" + phonebook.get(number));
        else {
            System.out.println("Нет такого контакта");
        }
    }

    public static void main(String[] args) {
        add("Ivanov", "8947646021");
        add("Smirnov", "8999906022");
        add("Sidorov", "8999945023");
        get("Sidorov");
        get("Smirnov");

    }
}
