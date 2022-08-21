package ru.GB.Gaitanov.I.thirdquarter.HomeWork1;

import java.util.Arrays;

public class Change {

    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ints));
        swap(ints, 2, 3);
        System.out.println(Arrays.toString(ints));
    }

    public static <T> void swap(T[] array, int firstIndex, int secondIndex) {
        if (firstIndex < 0 || secondIndex < 0) {
            throw new IllegalArgumentException();
        }
        if (array == null) {
            throw new IllegalArgumentException();
        }
        int length = array.length;
        if (firstIndex > length || secondIndex > array.length) {
            throw new IllegalArgumentException();
        }
        T tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }
    }

