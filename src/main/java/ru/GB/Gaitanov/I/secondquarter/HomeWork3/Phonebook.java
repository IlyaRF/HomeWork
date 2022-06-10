package ru.GB.Gaitanov.I.secondquarter.HomeWork3;

import java.util.*;

public class Phonebook {
    static HashMap<String, String> phonebook = new HashMap<>();

    public static void main(String[] args) {

        add("8947646021", "Ivanov");
        add("8999906022", "Smirnov");
        add("8999945023", "Sidorov");
        add("8999943502", "Sidorov");
        get("Smirnov");
        get("Sidorov");
        get("dsdsd");

    }

    public static void add(String number, String surname) {
        phonebook.put(number, surname);

    }
    public static void get(String surname){
        if(phonebook.containsValue(surname)) {
            Set<Map.Entry<String, String>> set = phonebook.entrySet();
            for (Map.Entry<String, String> temp : set) {
                if(temp.getValue().equals(surname)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("Нет в базе");
        }
    }
}
