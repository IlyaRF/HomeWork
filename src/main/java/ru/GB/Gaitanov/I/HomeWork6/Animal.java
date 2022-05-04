package ru.GB.Gaitanov.I.HomeWork6;

public abstract class Animal {
    public void main(String[] args) {

    }

    private String name;
    private int swim;
    private int run;
    private static int sum;


    public Animal(String name, int swim, int run) {
        this.name = name;
        this.swim = swim;
        this.run = run;


    }

    public String getName() {
        return name;
    }

    public static int getSum() {
        return sum;
    }

    public static void setSum(int sum) {
        Animal.sum = sum;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        if (run <= 200 && run > 0) {
            this.run = run;
        } else {
            System.out.println(200);

        }
        }
        public void print () {
            System.out.println(name + " пробежал " + getRun());
            System.out.println(name + " проплыл " + getSwim());
        }
    }



