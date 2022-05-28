package ru.GB.Gaitanov.I.HomeWork9;


public class Main {

    public static void main(String[] args) {


        Obstacles[] obstacles = new Obstacles[6];

        obstacles[0] = new Treadmill(6);
        obstacles[1] = new Treadmill(7);
        obstacles[2] = new Treadmill(8);
        obstacles[3] = new Wall(6);
        obstacles[4] = new Wall(7);
        obstacles[5] = new Wall(8);

        Participant[] participants = new Participant[9];
        participants[0] = new Cat("Snejok", 8, 10);
        participants[1] = new Cat("Murzik", 9, 9);
        participants[2] = new Cat("Vasya", 10, 11);
        participants[3] = new Human(10, 10);
        participants[4] = new Human(9, 8);
        participants[5] = new Human(8, 11);
        participants[6] = new Robot(10, 12);
        participants[7] = new Robot(5, 7);
        participants[8] = new Robot(3, 9);

}

    }



