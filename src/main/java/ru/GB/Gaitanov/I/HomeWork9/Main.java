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




        Run[] run = new Run[4];
        run[0] = new Run() {
            @Override
            public void run(int r) {

            }
        };
        run[1] = new Run() {
            @Override
            public void run(int r) {

            }
        };
        run[2] = new Run() {
            @Override
            public void run(int r) {

            }
        };

        run[3] = new Run() {
            @Override
            public void run(int r) {

            }
        };


        Jump[] jump = new Jump[4];
        jump[0] = new Jump() {

            @Override
            public void jump(int j) {

            }
        };
        jump[1] = new Jump() {
            @Override
            public void jump(int j) {

            }
        };
        jump[2] = new Jump() {
            @Override
            public void jump(int j) {

            }
        };

        jump[3] = new Jump() {
            @Override
            public void jump(int j) {

            }
        };






    }


}

