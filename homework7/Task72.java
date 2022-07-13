package com.hillel.kucherenko.homework7;

import java.util.Arrays;

public class Task72 {

    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4};
        int[] targetArray = {5, 6, 7};

        targetArray = arrayCopy(sourceArray, targetArray);
        System.out.println(Arrays.toString(targetArray));
    }

    static int[] arrayCopy(int[] source, int[] target) {
        int[] tempArray = new int[source.length + (target != null ? target.length : 0)];
        int counter = 0;

        while (counter != tempArray.length) {
            if (target != null) {
                for (int i = 0; i < target.length; i++) {
                    tempArray[i] = target[i];
                    counter++;
                }
            }
            if (source.length > 0) {
                for (int i = 0; i < source.length; i++) {
                    tempArray[counter] = source[i];
                    counter++;
                }
            }
        }
        return tempArray;
    }
}
