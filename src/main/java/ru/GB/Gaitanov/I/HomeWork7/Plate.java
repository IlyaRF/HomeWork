package ru.GB.Gaitanov.I.HomeWork7;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {

        if (n < food) {
            food -= n;
            System.out.println("Кот поел");
        } else {
            System.out.println("Недостаточно еды в тарелке, добавил 500 еды");
            this.food = 500;
        }




    }

    public void checkSatiety(Cat c) {
        c.checkSatiety(food);

    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }


    public void info() {
        System.out.println("На тарелке еды: " + food);


    }
}

