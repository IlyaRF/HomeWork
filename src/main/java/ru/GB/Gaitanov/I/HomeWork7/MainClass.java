package ru.GB.Gaitanov.I.HomeWork7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 105, false);
        Plate plate = new Plate(100);
        plate.info();
        cat.info();
        cat.eat(plate);
        plate.info();
        plate.setFood(plate.getFood() - cat.getAppetite());
        plate.infoSatiety();


    }
}


