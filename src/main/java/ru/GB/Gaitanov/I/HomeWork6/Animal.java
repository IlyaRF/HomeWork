package ru.GB.Gaitanov.I.HomeWork6;

public abstract class Animal<counter> {


    private String name;
    private int swim;
    private int run;
    private static int sumDog;
    private static int sumCat;


    public Animal(String name, int swim, int run) {
        this.name = name;
        this.swim = swim;
        this.run = run;

    }

    public String getName() {
        return name;
    }


    public static void setSumCat(int sum2) {
        sumCat = sum2;
    }

    public static void setSumDog(int sum1) {
        sumDog = sum1;

    }

    public int getSwim() {
        return swim;
    }

    public int setSwim(int swim) {
        this.swim = swim;

        return swim;
    }

    public int getRun() {
        return run;
    }

    public int setRun(int run) {
        this.run = run;

        return run;
    }


    public void print() {
        System.out.println(getName() + " пробежал " + getRun());
        System.out.println(getName() + " проплыл " + getSwim());
    }
        public static void printCounter() {
            System.out.println("Всего собак создано - " + sumDog + ". Всего кошек создано - " + sumCat);


        }

    }






