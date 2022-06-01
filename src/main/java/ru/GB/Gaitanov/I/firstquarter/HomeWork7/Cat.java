package ru.GB.Gaitanov.I.firstquarter.HomeWork7;

public class Cat {
    private final String name;
    private int appetite;
    private boolean satiety;
    private int check;


    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        this.check = check;
    }

    public int getAppetite() {
        return appetite;


    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);


    }

    public void checkSatiety(int c) {
        if (c > appetite)
            check = 1;
        else
            check = 0;

    }
    public boolean check() {
        if (check > 0)
           return this.satiety = false;
        else
           return this.satiety = true;

}
    public void info() {
        System.out.println(name + " cытость: " + this.satiety);


    }
}



