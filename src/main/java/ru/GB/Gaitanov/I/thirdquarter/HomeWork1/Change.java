package ru.GB.Gaitanov.I.thirdquarter.HomeWork1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Change {

    public static void main(String[] args) {
    }

    public static void swap(Map< Integer, Integer> array1) {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> swapped = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        }
    }

