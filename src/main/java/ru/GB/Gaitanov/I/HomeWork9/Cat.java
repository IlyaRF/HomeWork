package ru.GB.Gaitanov.I.HomeWork9;

public class Cat implements Activity {

    private static int run;
    private static int jump;


    @Override
    public void run(int length) {

    }

    @Override
    public void jump(int height) {

    }

    public Cat(int run, int jump) {

        this.run = run;
        this.jump = jump;
    }


    public static int getRun() {
        return run;

    }

    public static int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;

    }

    static void checkRun() {
        if (Cat.getRun() >= Treadmill.length)
            System.out.println("Пробежал " + run + " " + Treadmill.length);
        else
            System.out.println("Не пробежал " + run + " " + Treadmill.length);
    }

    static void checkJump() {
        if (Cat.getJump() >= Wall.height)
            System.out.println("Перепрыгнул " + jump + " " + Wall.height);
        else
            System.out.println("Не перепрыгнул " + jump + " " + Wall.height);

    }
}

