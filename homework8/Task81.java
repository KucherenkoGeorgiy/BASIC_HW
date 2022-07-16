package com.hillel.kucherenko.homework8;

import java.util.Arrays;

public class Task81 {
    public static void main(String[] args) {
        int[] arrayOfCompany = createArray(0, 9, 7);
        int[] arrayOfPlayer = createArray(0, 9, 7);
        int quantityOfMatches = 0;

        Arrays.sort(arrayOfCompany);
        Arrays.sort(arrayOfPlayer);

        System.out.println(Arrays.toString(arrayOfCompany));
        System.out.println(Arrays.toString(arrayOfPlayer));

        for (int i = 0; i < arrayOfCompany.length; i++) {
            if (arrayOfCompany[i] == arrayOfPlayer[i]) {
                quantityOfMatches++;
            }
        }

        System.out.println("Quantity of matches: " + quantityOfMatches);

    }

    static int[] createArray(int fromValue, int toValue, int quantityOfValues) {
        int[] newArray = new int[quantityOfValues];
        for (int i = 0; i < quantityOfValues; i++) {
            newArray[i] = (int) (Math.random() * (toValue - fromValue + 1)) + fromValue;
        }
        return newArray;
    }
}
