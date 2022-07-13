package com.hillel.kucherenko.homework7;

import java.util.Arrays;

public class Task71 {

    public static void main(String[] args) {
        int[] teamA = createTeam(18, 40, 25);
        int[] teamB = createTeam(18, 40, 25);

        System.out.println("Ages of Players of First Team: "
                + Arrays.toString(teamA));
        System.out.println("Ages of Players of Second Team: "
                + Arrays.toString(teamB));

        System.out.println("Average age of of Players in First team is "
                + averageTeamAge(teamA));
        System.out.println("Average age of of Players in Second team is "
                + averageTeamAge(teamB));

    }

    static int[] createTeam(int ageFrom, int ageTo, int quantityOfPlayers) {
        int[] team = new int[quantityOfPlayers];
        for (int i = 0; i < quantityOfPlayers; i++) {
            team[i] = (int) ((Math.random() * (ageTo - ageFrom + 1))) + ageFrom;
        }
        return team;
    }

    static double averageTeamAge(int[] team) {
        int totalAge = 0;
        double averageAge;
        for (int i = 0; i < team.length; i++) {
            totalAge += team[i];
        }
        averageAge = (double) Math.round((double) (totalAge * 10) / team.length) / 10;
        return averageAge;
    }
}
