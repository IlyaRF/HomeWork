package ru.GB.Gaitanov.I.secondquarter.HomeWork1;

public class Competition {

    public void competition(Activity[] participants, Obstacles[] obstacles) {
        boolean isParticipantFail = true;
        for (int i = 0; i < participants.length; i++) {
            for (int i1 = 0; i1 < obstacles.length; i1++) {
                if (isParticipantFail) {
                    isParticipantFail = participants[i].checkRun(obstacles[i1].getValue());
                    if (!isParticipantFail) {
                        System.out.println(" не смог");
                        break;
                    } else {
                        isParticipantFail = participants[i].checkJump(obstacles[i1].getValue());

                    }
                }else {
                    System.out.println(" не смог");
                }
                    break;
            }
        }
    }
}
