package ru.GB.Gaitanov.I.HomeWork9;

public class Main {

    public static void main(String[] args) {



        Cat[] cat = new Cat[3];

        cat[0] = new Cat("Murzik", 20, 5);
        cat[1] = new Cat("Ezhik", 20, 6);
        cat[2] = new Cat("Vasya", 18, 7);


        Human[] human = new Human[3];

        human[0] = new Human("Igor", 8, 2);
        human[1] = new Human("Aleksandr", 9, 3);
        human[2] = new Human("Arkady", 8, 4);

        Robot[] robot = new Robot[4];

        robot[1] = new Robot("T-800", 12, 5);
        robot[1] = new Robot("T-1000", 20, 9);
        robot[1] = new Robot("T-X", 50, 20);


cat[0].run(5);
    }


}

