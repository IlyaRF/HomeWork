package ru.GB.Gaitanov.I.secondquarter.HomeWork1;

public interface Activity {



    void run (int length);

    void jump (int height);

    static void length(int a) {
      int length = Treadmill.length;
    }
    boolean checkRun(int a);

    int setRun(int run);

    boolean checkJump(int jump);

    }






