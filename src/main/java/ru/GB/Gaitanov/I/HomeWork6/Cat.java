package ru.GB.Gaitanov.I.HomeWork6;

public class Cat extends Animal {
    public Cat(String name, int swim, int run) {
        super(name, swim, run);

    }

    @Override
    public int setRun(int run) {
        if (run > 0 && run < 200)
            return super.setRun(run);

        else
            return super.setRun(200);
    }
    @Override
    public int setSwim(int swim) {
        if (swim != 0)
            return super.setSwim(0);
        else
            return super.setSwim(swim);
    }



    /*@Override
    public int getRun() {
        if (getRun() > 200)
            int getRun() = 0;
        return getRun();*/
    }





