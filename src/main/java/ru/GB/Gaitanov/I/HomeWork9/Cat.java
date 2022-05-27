package ru.GB.Gaitanov.I.HomeWork9;

public class Cat {

    private String name;
    private int run;
    private int jump;


    public Cat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;


    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }
}

