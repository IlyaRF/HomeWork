package ru.GB.Gaitanov.I.secondquarter.HomeWork1;

import java.util.Queue;

public class Cat implements Activity, Participant {

        private static final int maxRun = 9;
    private static final int maxJump = 9;
    private String name;


    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return maxRun;

    }

    public int getJump() {
        return maxJump;

    }

    @Override
    public void run(int lengthRun) {

    }

    @Override
    public void jump(int height) {


    }
    @Override
    public boolean checkRun(int run) {
        if (maxRun >= run) {
            System.out.println(name + " пробежал");
            return true;
        } else {
            System.out.println(name + " не пробежал");
            return false;
        }
    }
    @Override
    public boolean checkJump(int jump) {
        if (maxJump >= jump) {
            System.out.println(name + " перепрыгнул" );
            return true;
        } else {
            System.out.println(name + " не перепрыгнул");
            return false;
        }
    }
}





