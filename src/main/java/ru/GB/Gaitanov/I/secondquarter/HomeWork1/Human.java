package ru.GB.Gaitanov.I.secondquarter.HomeWork1;

public class Human implements Activity, Participant {

    private static int maxRun = 8;
    private static int maxJump = 7;


    public Human() {

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
