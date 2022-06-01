package ru.GB.Gaitanov.I.firstquarter.HomeWork6;

public class HomeWork extends Animal {

    public HomeWork(String name, int swim, int run) {
        super(name, swim, run);


    }

    public static void main(String[] args) {

        Animal[] cat = new Cat[5];
        final Cat cat1 = new Cat("Мурзик", 100, 300);
        final Cat cat2 = new Cat("Барсик", 10, 80);
        final Cat cat3 = new Cat("Снежок", 0, 100);
        final Cat cat4 = new Cat("Хвостик", 10, 50);
        final Cat cat5 = new Cat("Кузя", 0, 99);


        Animal[] dog = new Dog[3];
        final Dog dog1 = new Dog("Шарик", 100, 300);
        final Dog dog2 = new Dog("Бобик", 10, 100);
        final Dog dog3 = new Dog("Тузик", 50, 500);

        int a = cat.length;
        int b = dog.length;
        setSumCat(a);
        setSumDog(b);


        cat1.setRun(200);
        cat1.setSwim(-10);
        cat1.print();
        cat2.setRun(600);
        cat2.setSwim(50);
        cat2.print();
        cat3.setRun(101);
        cat3.setSwim(0);
        cat3.print();
        cat4.setRun(99);
        cat4.setSwim(0);
        cat4.print();

        dog1.setRun(600);
        dog1.setSwim(8);
        dog1.print();
        dog2.setRun(200);
        dog2.setSwim(10);
        dog2.print();

        printCounter();

    }
}



