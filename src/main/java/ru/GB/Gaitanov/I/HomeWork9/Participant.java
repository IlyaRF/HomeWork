package ru.GB.Gaitanov.I.HomeWork9;

public interface Participant {


    static void checkRun(int run) {
        if (run >= Treadmill.length)
            System.out.println("Пробежал " + run + " " + Treadmill.length);
        else
            System.out.println("Не пробежал " + run + " " + Treadmill.length);
    }

    static void checkJump(int jump) {
        if (jump >= Wall.height)
            System.out.println("Перепрыгнул " + jump + " " + Wall.height);
        else
            System.out.println("Не перепрыгнул " + jump + " " + Wall.height);

    }
}

