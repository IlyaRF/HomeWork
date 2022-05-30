package ru.GB.Gaitanov.I.secondquarter.HomeWork1;


public class Treadmill implements Obstacles {

    public static int length;


    public static int getLength() {
        return length;
    }

    public Treadmill(int length) {

        this.length = length;

    }
    public void setLength(int length) {
        this.length = length;

    }


    @Override
    public int getValue() {
        return length;
    }
}

