package ru.GB.Gaitanov.I.HomeWork9;

public class Robot implements Activity, Participant{

    private int run;
    private int jump;


    public Robot(int run, int jump) {

        this.run = run;
        this.jump = jump;
    }


    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    @Override
    public void run(int lengthRun) {

    }

    @Override
    public void jump(int height) {

    }
}
