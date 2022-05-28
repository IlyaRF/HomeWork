package ru.GB.Gaitanov.I.secondquarter.HomeWork1;

public class Robot implements Participant, Activity {

    private static int maxRun = 15;
    private static int maxJump = 15;


    public Robot() {

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

    public int setRun(int run) {
        return 0;

    }

    public void setJump(int maxJump) {
        this.maxJump = maxJump;
    }
    @Override
    public boolean checkRun(int run) {
        if (maxRun >= run) {
            System.out.println("Пробежал");
            return true;
        } else {
            System.out.println("Не пробежал");
            return false;
        }
    }
    @Override
    public boolean checkJump(int jump) {
        if (maxJump >= jump) {
            System.out.println("Перепрыгнул" );
            return true;
        } else {
            System.out.println("Не перепрыгнул");
            return false;
        }
    }
}
