package ru.GB.Gaitanov.I.HomeWork6;

public class Animal {
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

    public double getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;

    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;


    }
    public void print() {
        System.out.println(name + " пробежал " + this.run);
        System.out.println(name + " проплыл " + this.swim);
    }
}


