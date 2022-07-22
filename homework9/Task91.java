package com.hillel.kucherenko.homework9;

import java.util.Scanner;

public class Task91 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueM;
        int valueN;
        int[][] matrix;
        int[][] transposedMatrix;

        System.out.println("Now we will make two matrices with size M * N.. "
                + "You have to put sizes.. Now please enter \"M\" (let it be between 1 and 30):");
        valueM = getUsersInput(scanner);

        System.out.println("Now please enter \"N\" (let it be between 1 and 30 also):");
        valueN = getUsersInput(scanner);
        System.out.println("okay! now building the Matrix..:");
        matrix = new int[valueM][valueN];
        buildMatrix(matrix);
        printMatrix(matrix);
        System.out.println("Transposed matrix:");
        transposedMatrix = transposeMatrix(matrix, valueM, valueN);
        printMatrix(transposedMatrix);
    }

    static int getUsersInput(Scanner scanner) {
        int usersInput;

        while (true) {
            if (scanner.hasNextInt()) {
                usersInput = scanner.nextInt();
                if (usersInput < 1 || usersInput > 30) {
                    System.out.println("Please enter value between 1 and 30");
                } else {
                    return usersInput;
                }
            } else {
                System.out.println("Your value must be numeric..Between 1 and 30. Please, try again");
                scanner.next();
            }
        }
    }

    static void buildMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10); //making numbers from 0 to 9
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] transposeMatrix(int[][] matrix, int valueM, int valueN) {
        int[][] transposedMatrix = new int[valueN][valueM];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}
