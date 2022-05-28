package ru.GB.Gaitanov.I.HomeWork9;

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

    void checkJump(int jump) {
        if (getJump() >= Wall.height)
            System.out.println("Перепрыгнул " + getJump() + " " + Wall.height);
        else
            System.out.println("Не перепрыгнул " + getJump() + " " + Wall.height);

    }
    public int getJump() {
        return jump;

    }
}


