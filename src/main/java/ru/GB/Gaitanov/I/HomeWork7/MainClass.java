package ru.GB.Gaitanov.I.HomeWork7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 105, false);
        Cat cat1 = new Cat("Murzik", 50, false);
        Cat cat2 = new Cat("Pushok", 30, false);
        Cat cat3 = new Cat("Snezhok", 200, false);
        Plate plate = new Plate(300);
        plate.info();
        cat.info();
        cat.eat(plate);
        cat.check();
        plate.info();
        cat.info();
        cat1.info();
        cat1.eat(plate);
        cat1.check();
        cat1.info();
        plate.info();
        cat2.info();
        cat2.eat(plate);
        cat2.check();
        cat2.info();
        plate.info();
        cat3.info();
        cat3.eat(plate);
        cat3.check();
        plate.info();
        plate.setFood(plate.getFood() - cat.getAppetite());



    }
}


