package ru.GB.Gaitanov.I.HomeWork6;

public class Cat extends Animal {
    public Cat(String name, int swim, int run) {
        super(name, swim, run);
    }

    @Override
    public void setRun(int run) {
        run = Math.max(run, 200);

    }



    @Override
    public void setSwim(int swim) {
        swim = Math.max(swim, 200);

    }
}

