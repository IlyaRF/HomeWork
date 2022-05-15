package ru.GB.Gaitanov.I.HomeWork7;

public class Cat {
    private final String name;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;

    }

    public int getAppetite() {
        return appetite;
        

    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);


    }

    public void info() {
        System.out.println("satiety: " + satiety);
    }


}



