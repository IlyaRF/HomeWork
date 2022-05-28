package ru.GB.Gaitanov.I.secondquarter.HomeWork1;

public class Wall implements Obstacles {

    public static int height;


    public int getHeight() {
        return height;
    }

    public Wall(int height) {

        this.height = height;

    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getValue() {
        return height;
    }
}
