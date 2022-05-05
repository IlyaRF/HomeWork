package ru.GB.Gaitanov.I.HomeWork6;

import ru.GB.Gaitanov.I.HomeWork5.Employee;

public class HomeWork extends Animal {

    public HomeWork(String name, int swim, int run) {
        super(name, swim, run);


    }

    public static void main(String[] args) {

        Animal[] cat = new Cat[3];
        final Cat cat1 = new Cat("Мурзик", 100, 300);
        final Cat cat2 = new Cat("Барсик", 10, 240);
        final Cat cat3 = new Cat("Кузя", 300, 500);

        Animal[] dog = new Dog[3];
        final Dog dog1 = new Dog("Шарик", 100, 300);
        final Dog dog2 = new Dog("Бобик", 10, 100);
        final Dog dog3 = new Dog("Тузик", 50, 500);

        int sumCat = cat.length;
        int sumDog = dog.length;
        ;

        cat1.setRun(300);
        cat1.setSwim(-10);
        cat1.print();

        dog1.setRun(600);
        dog1.setSwim(50);
        dog1.print();

    }
}



