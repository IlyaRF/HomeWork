package ru.GB.Gaitanov.I.HomeWork9;

public interface Participant {

    static void checkRun() {
        if (Cat.getRun() >= Treadmill.length)
            System.out.println("Пробежал " + Cat.getRun() + " " + Treadmill.length);
        else
            System.out.println("Не пробежал " + Cat.getRun() + " " + Treadmill.length);
    }

    static void checkJump() {
        if (Cat.getJump() >= Wall.height)
            System.out.println("Перепрыгнул " + Cat.getJump() + " " + Wall.height);
        else
            System.out.println("Не перепрыгнул " + Cat.getJump() + " " + Wall.height);

    }
}

