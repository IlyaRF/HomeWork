package ru.GB.Gaitanov.I.HomeWork9;

public class Cat implements Activity, Participant {

    private static int run;
    private static int jump;


    @Override
    public void run(int length) {

    }

    @Override
    public void jump(int height) {

    }

    public Cat(int run, int jump) {

        Cat.run = run;
        Cat.jump = jump;
    }


    public static int getRun() {
        return run;

    }

    public static int getJump() {
        return jump;
    }

    static void checkRun() {
        if (Cat.getRun() >= Treadmill.length)
            System.out.println("Пробежал " + Cat.getRun() + " " + Treadmill.length);
        else
            System.out.println("Не пробежал " + Cat.getRun() + " " + Treadmill.length);
    }

    static void checkJump() {
        if (Cat.getJump() >= Wall.height)
            System.out.println("Перепрыгнул " + Cat.getJump() + " " + Wall.height);
        else
            System.out.println("Не перепрыгнул " + Cat.getJump() + " " + Wall.height);
    }
}


