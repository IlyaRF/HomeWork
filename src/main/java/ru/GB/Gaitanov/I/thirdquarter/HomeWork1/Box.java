package ru.GB.Gaitanov.I.thirdquarter.HomeWork1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> friuts;

    public Box(T... fruits) {
        this.friuts = new ArrayList<>(Arrays.asList(fruits));

    }

    double getWeight() {
        return friuts.stream()
                .map(Fruit::getWieght)
                .reduce(Double::sum)
                .get();

    }

    void addAll(List<? extends T> fruits) {
        friuts.addAll(fruits);

    }

    void moveTo(Box<? super T > box) {
        box.addAll(friuts);
        friuts.clear();
    }
}

