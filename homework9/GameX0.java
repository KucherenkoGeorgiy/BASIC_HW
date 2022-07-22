package com.hillel.kucherenko.homework9;

import java.util.Scanner;

public class GameX0 {
    static String flagOfInput;
    static boolean haveWinner;
    static String yesOrNo;

    public static void main(String[] args) {
        String[][] gameField;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's start the Game!");

        while (true) {
            gameField = printField();
            flagOfInput = "X";
            haveWinner = false;
            startGame(gameField, scanner);

            System.out.println("want play again? Type \"exit\" to quit.. or type anything else to continue");
            yesOrNo = scanner.next();
            if (yesOrNo.equalsIgnoreCase("exit")) {
                System.out.println("OK, the program is finishing..");
                break;
            } else {
                System.out.println("OK! Let's start new Game!!!");
                System.out.println();
            }
        }
    }

    static String[][] printField() {
        String[][] gameField = new String[3][3];
        int counter = 1;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                gameField[i][j] = Integer.toString(counter);
                System.out.print(gameField[i][j] + "\t");
                counter++;
            }
            System.out.println();
        }
        return gameField;
    }

    static void startGame(String[][] gameField, Scanner scanner) {
        int counter = 0;
        int tempValue;

        System.out.println("Now you should choose a place for \"" + flagOfInput
                + "\".. Please input the number from 1 to 9");
        while (counter < 9) {
            if (scanner.hasNextInt()) {
                tempValue = scanner.nextInt();
                if (tempValue < 0 || tempValue > 9) {
                    System.out.println("You have to enter value from 1 to 9");
                } else {
                    if (checkPossibility(gameField, tempValue)) {
                        modifyGameField(gameField, Integer.toString(tempValue));
                        counter++;
                    }
                }
            } else {
                System.out.println("You must enter only numbers from 1 to 9.. Please try again");
                scanner.next();
            }

            if (counter == 9) {
                System.out.println("It was the last try.. The Game is Finished");
            }
            if (haveWinner) {
                break;
            }
        }
    }

    static boolean checkPossibility(String[][] gameField, int userInput) {
        int counter = 0;

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                counter++;
                if (counter == userInput) {
                    if (!gameField[i][j].equals("X") && !gameField[i][j].equals("0")) {
                        return true;
                    } else {
                        System.out.println("No, we can not put " + userInput
                                + ".. There is already \"" + gameField[i][j] + "\"");
                        return false;
                    }
                }
            }

        }
        return true;
    }

    static void modifyGameField(String[][] gameField, String userInput) {
        int counter = 0;
        int valX = 0, val0 = 0;

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                counter++;
                if (Integer.toString(counter).equals(userInput)) {
                    gameField[i][j] = flagOfInput;
                    valX = i;
                    val0 = j;
                    System.out.print(gameField[i][j] + "\t");
                } else {
                    System.out.print(gameField[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();

        if (gameField[valX][1].equals(gameField[valX][2]) && gameField[valX][2].equals(gameField[valX][0])
                || gameField[0][val0].equals(gameField[1][val0]) && gameField[1][val0].equals(gameField[2][val0])) {
            makeHaveWinner();
        }

        if (userInput.equals("1") || userInput.equals("5") || userInput.equals("9")) {
            if (gameField[0][0].equals(gameField[1][1]) && gameField[2][2].equals(gameField[1][1])) {
                makeHaveWinner();
            }
        }

        if (userInput.equals("3") || userInput.equals("5") || userInput.equals("7")) {
            if (gameField[0][2].equals(gameField[1][1]) && gameField[2][0].equals(gameField[1][1])) {
                makeHaveWinner();
            }
        }

        if (flagOfInput.equals("X")) {
            flagOfInput = "0";
        } else {
            flagOfInput = "X";
        }

    }

    static void makeHaveWinner() {
        System.out.println("We have the winner!! it is - " + flagOfInput);
        haveWinner = true;
    }

}
