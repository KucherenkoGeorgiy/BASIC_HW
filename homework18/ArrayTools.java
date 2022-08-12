package com.hillel.kucherenko.homework18;

import java.util.Arrays;

public class ArrayTools {

    public static int searchForElement(int[] usersArray, int searchValue) {
        for (int i = 0; i < usersArray.length; i++) {
            if (usersArray[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    public static boolean checkIfArrayIsSorted(int[] usersArray) {
        int[] tempArray = usersArray.clone();
        Arrays.sort(usersArray);
        if (Arrays.toString(usersArray).equals(Arrays.toString(tempArray))) {
            return true;
        }
        return false;
    }
}
