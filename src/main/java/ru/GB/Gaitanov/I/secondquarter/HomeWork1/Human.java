package ru.GB.Gaitanov.I.secondquarter.HomeWork1;

public class Human implements Activity, Participant {

    private static int maxRun = 8;
    private static int maxJump = 7;
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public int getRun() {
        return maxRun;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
            System.out.println(name + " перепрыгнул");
            return true;
        } else {
            System.out.println(name + " не перепрыгнул");
            return false;
        }
    }
}
