package ru.GB.Gaitanov.I.HomeWork9;

public class Cat extends Animal implements Activity, Participant {

    private String name;
    private final int run;
    private final int jump;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void run(int length) {

    }

    @Override
    public void jump(int height) {

    }

    public Cat(String name, int run, int jump) {

        this.run = run;
        this.jump = jump;
        this.name = name;
    }


    public int getRun() {
        return run;

    }

    static void checkRun(int run) {
        if (run >= Treadmill.length)
            System.out.println("Пробежал " + run + " " + Treadmill.length);
        else
            System.out.println("Не пробежал " + run + " " + Treadmill.length);
    }

    static void checkJump(int jump) {
        if (jump >= Wall.height)
            System.out.println("Перепрыгнул " + jump + " " + Wall.height);
        else
            System.out.println("Не перепрыгнул " + jump + " " + Wall.height);

    }
    public int getJump() {
        return jump;

    }
}


