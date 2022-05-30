package ru.GB.Gaitanov.I.secondquarter.HomeWork1;

public class Robot implements Participant, Activity {

    private static int maxRun;
    private static int maxJump;
    private String name;


    public Robot(String name, int maxJump, int maxRun) {
        this.name = name;

    }

    public int getRun() {
        return maxRun;

    }

    public int getJump() {
        return maxJump;

    }

    public String getName() {
        return this.name;
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
   // @Override
    public boolean checkRun(int length) {
        if (maxRun >= length) {
            System.out.println(name + " пробежал");
            return true;
        } else {
            System.out.println(name + " не пробежал");
            return false;
        }
    }
   // @Override
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
