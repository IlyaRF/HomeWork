package ru.GB.Gaitanov.I.HomeWork6;

public class Dog extends Animal {
    public Dog(String name, int swim, int run) {
        super(name, swim, run);
    }


    @Override
    public int setRun(int run) {
        if (run > 0 && run < 500)
            return super.setRun(run);

        else
            return super.setRun(500);
    }
    @Override
    public int setSwim(int swim) {
        if (swim > 0 && swim < 10)
            return super.setSwim(swim);
        else
            return super.setSwim(10);

    }
}
