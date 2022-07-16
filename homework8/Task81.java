package com.hillel.kucherenko.homework8;

import java.util.Arrays;

public class Task81 {
    public static void main(String[] args) {
        int minArrayValue = 0;
        int maxArrayValue = 9;
        int quantityOfValues = 7;
        int[] arrayOfCompany = createArray(minArrayValue, maxArrayValue, quantityOfValues);
        int[] arrayOfPlayer = createArray(minArrayValue, maxArrayValue, quantityOfValues);
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

    static int[] createArray(int minArrayValue, int maxArrayValue, int quantityOfValues) {
        int[] newArray = new int[quantityOfValues];
        for (int i = 0; i < quantityOfValues; i++) {
            newArray[i] = (int) (Math.random() * (maxArrayValue - minArrayValue + 1)) + minArrayValue;
        }
        return newArray;
    }
}
