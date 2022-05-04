package ru.GB.Gaitanov.I.HomeWork6;

public class Cat extends Animal {
    public Cat(String name, int swim, int run) {
        super(name, swim, run);
    }
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= getRunLength())) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("swim: false");
    }


    }


