package ru.GB.Gaitanov.I.secondquarter.HomeWork1;

public class Competition {

    public void competition(Activity[] participants, Obstacles[] obstacles) {
        boolean runResult;
        for (int i = 0; i < participants.length; i++) {
            for (int i1 = 0; i1 < obstacles.length; i1++) {
                runResult = participants[i].checkRun(obstacles[i1].getValue());
                if (runResult) {
                    participants[i].checkJump(obstacles[i1].getValue());
                } else {
                    System.out.println("не смог");
                }
            }
        }
    }
}
