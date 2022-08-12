package com.hillel.kucherenko.homework18;

public class ArrayUtils {

    public static double findAverage(int[][] usersArray) {
        double averageValue = 0;
        int counter = 0;
        for (int i = 0; i < usersArray.length; i++) {
            for (int j = 0; j < usersArray[i].length; j++) {
                averageValue += usersArray[i][j];
                counter++;
            }
        }
        averageValue = averageValue / counter;
        return averageValue;
    }

    public static boolean checkIfArrayIsSquare(int[][] usersArray) {
        for (int i = 0; i < usersArray.length; i++) {
            if (usersArray[i].length != usersArray.length) {
                return false;
            }
        }
        return true;
    }
}
