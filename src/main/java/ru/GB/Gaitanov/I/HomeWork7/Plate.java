package ru.GB.Gaitanov.I.HomeWork7;

public class Plate {
    public boolean satiety;
    public int infoFood;
    private int food;

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        if (n < food)
            satiety = true;
        if (n < food)
        food -= n;
        else
        System.out.println("Недостаточно еды в тарелке");


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

    public void infoSatiety() {
        System.out.println("Сытость кота: " + satiety);
    }
}

