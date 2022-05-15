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
        plate.info();
        plate.infoSatiety();
        cat1.info();
        cat1.eat(plate);
        plate.info();
        plate.infoSatiety();
        cat2.info();
        cat2.eat(plate);
        plate.info();
        plate.infoSatiety();
        cat3.info();
        cat3.eat(plate);
        plate.info();
        plate.setFood(plate.getFood() - cat.getAppetite());



    }
}


