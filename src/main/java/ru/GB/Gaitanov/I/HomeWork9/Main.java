package ru.GB.Gaitanov.I.HomeWork9;

public class Main {

    public static void main(String[] args) {



        Cat[] cat = new Cat[3];

        cat[0] = new Cat(20, 8);
        cat[1] = new Cat(20, 13);
        cat[2] = new Cat(9, 16);


        Human[] human = new Human[3];

        human[0] = new Human(8, 4);
        human[1] = new Human(9, 9);
        human[2] = new Human(8, 11);

        Robot[] robot = new Robot[3];

        robot[0] = new Robot(12, 5);
        robot[1] = new Robot(20, 9);
        robot[2] = new Robot(50, 20);

        Treadmill[] treadmill = new Treadmill[3];

        treadmill[0] = new Treadmill(6);
        treadmill[1] = new Treadmill(7);
        treadmill[2] = new Treadmill(8);

        Wall[] wall = new Wall[3];

        wall[0] = new Wall(6);
        wall[1] = new Wall(7);
        wall[2] = new Wall(8);



        cat[2].checkRun();
        cat[2].checkJump();

    }


}

