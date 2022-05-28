package ru.GB.Gaitanov.I.HomeWork9;

public class Human implements Activity, Participant {

    private int run;
    private int jump;


    public Human(int run, int jump) {

        this.run = run;
        this.jump = jump;
    }

    public int getRun() {
        return run;

    }

    public int getJump() {
        return jump;

    }

    @Override
    public void run(int lengthRun) {

    }

    @Override
    public void jump(int height) {

    }
}
