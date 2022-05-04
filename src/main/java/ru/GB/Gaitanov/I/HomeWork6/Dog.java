package ru.GB.Gaitanov.I.HomeWork6;

public class Dog extends Animal {
    public Dog(String name, int swim, int run) {
        super(name, swim, run);
    }

    @Override
    public void setRun(int run) {
        super.setRun(500);
    }

    @Override
    public void setSwim(int swim) {
        super.setSwim(10);


    }
}
