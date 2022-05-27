package ru.GB.Gaitanov.I.HomeWork9;

public class Cat implements Run, Jump {

    private final String name;
    private final int checkRun;
    private final int checkJump;



    public Cat(String name, int checkRun, int checkJump) {
        this.name = name;
        this.checkRun = checkRun;
        this.checkJump = checkJump;

    }

   /* public void run() {

           // if (checkRun <= ())
                System.out.println("Кот прыгнул");
            else

        System.out.println("Кот не прыгнул");
    }*/

    public int getCheckJump() {
        return checkJump;
    }

    public int getCheckRun() {
        return checkRun;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
    }

    public void jump() {
        System.out.println("Кот прыгнул");
    }
}

