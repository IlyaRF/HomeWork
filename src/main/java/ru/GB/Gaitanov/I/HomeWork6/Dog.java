package ru.GB.Gaitanov.I.HomeWork6;

public class Dog extends Animal {
    public Dog(String name, int swim, int run) {
        super(name, swim, run);
    }

    @Override
    void runLength(int length) {
        if ((length >= 0) && (length <= getRunLength())) System.out.println("run: true");
    }

    @Override
    void swimLength(int length) {
        if ((length >= 0) && (length <= getSwimLength())) System.out.println("swim: true");
        else System.out.println("swim: false");
    }

}

