package ru.GB.Gaitanov.I.HomeWork6;

public abstract class Animal {
    public void main(String[] args) {

    }

    private String name;
    private int swimLength;
    private int runLength;
    private static int sum;

    abstract void runLength(int length);
    abstract void swimLength(int length);

    public Animal(String name, int swim, int run) {
        this.name = name;
        this.swimLength = swim;
        this.runLength = run;


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

    public int getSwimLength() {
        return swimLength;
    }

    public void setSwimLength(int swim) {
        this.swimLength = swimLength;

    }
    public int getRunLength() {
        return swimLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;

    }
    public void setName(String name) {
        this.name = name;
    }



       /* public void print () {
            System.out.println(name + " пробежал " + run());
            System.out.println(name + " проплыл " + getSwim());*/
        }




