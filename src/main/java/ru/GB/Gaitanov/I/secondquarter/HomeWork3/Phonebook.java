package ru.GB.Gaitanov.I.secondquarter.HomeWork3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Phonebook {

    private static final HashMap<String, String> phonebook = new HashMap<>();

    public static void main(String[] args) {

        add("Ivanov", "8947646021");
        add("Smirnov", "8999906022");
        add("Sidorov", "8999945023");
        get("Ivanov");
        get("Smirnov");
        System.out.println(getKeyFromValue(phonebook,"8999945023"));
    }
    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
    private static void add(String name, String number) {
        phonebook.put(name, number);

    }
    public static String[] get(String name) {
        List<String> result = new ArrayList<>();
        for (Map.Entry entry : phonebook.entrySet()) {
            if (name.equalsIgnoreCase((String) entry.getValue())) {
                result.add((String) entry.getKey());
            }
        }
        if (result.size() == 0) result.add("абонент не найден");
        return result.toArray(new String[0]);
    }
}
