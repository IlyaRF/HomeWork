package ru.GB.Gaitanov.I.HomeWork9;

public class Robot implements Participant, Activity{

    private int run;
    private int jump;


    public Robot(int run, int jump) {

        this.run = run;
        this.jump = jump;
    }


    public int getRun() {
        return run;
    }

    @Override
    public void run(int lengthRun) {

    }

    @Override
    public void jump(int height) {

    }

    public int setRun(int run) {
        return 0;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }
}
