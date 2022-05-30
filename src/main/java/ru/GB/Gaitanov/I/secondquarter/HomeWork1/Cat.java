package ru.GB.Gaitanov.I.secondquarter.HomeWork1;

public class Cat implements Activity, Participant {

    private final String name;
    private final int run;
    private final int jump;


    @Override
    public void run(int length) {

    }

    @Override
    public void jump(int height) {

    }

    @Override
    public boolean checkRun(int a) {
        return false;
    }

    @Override
    public int setRun(int run) {
        return 0;
    }

    public Cat(String name, int run, int jump) {
        this.run = run;


        this.jump = jump;
        this.name = name;
    }


    public int getRun() {
        return run;

    }
    public void checkRun() {
        if (getRun() >= Treadmill.length)
            System.out.println("Пробежал " + getRun() + " " + Treadmill.length);
        else
            System.out.println("Не пробежал " + getRun()+ " " + Treadmill.length);
    }

    public boolean checkJump(int jump) {
        if (getJump() >= Wall.height)
            System.out.println("Перепрыгнул " + getJump() + " " + Wall.height);
        else
            System.out.println("Не перепрыгнул " + getJump() + " " + Wall.height);

        return false;
    }
    public int getJump() {
        return jump;

    }
}






