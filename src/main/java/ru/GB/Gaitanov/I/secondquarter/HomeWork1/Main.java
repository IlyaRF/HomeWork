package ru.GB.Gaitanov.I.secondquarter.HomeWork1;


import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        Competition comp = new Competition();


        Treadmill treadmill1 = new Treadmill(6);
        Treadmill treadmill2 = new Treadmill(7);
        Treadmill treadmill3 = new Treadmill(8);
        Wall wall1 = new Wall(6);
        Wall wall2 = new Wall(7);
        Wall wall3 = new Wall(8);


        Obstacles[] obstacles = {
                treadmill1,
                treadmill2,
                treadmill3,
                wall1,
                wall2,
                wall3
        };


        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Robot robot1 = new Robot();
        Robot robot2 = new Robot();
        Robot robot3 = new Robot();

        Activity[] participants = {
                cat1,
                cat2,
                cat3,
                human1,
                human2,
                human3,
                robot1,
                robot2,
                robot3
        };

        comp.competition(participants, obstacles);
    }



}







