package com.hillel.kucherenko.homework6;

import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {
        int randNum = (int) (Math.random() * 11);
        int userNum;
        int tryQuant = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Я задумал число от 0 до 10.. Отдгадай его. У тебя 3 попытки");
        for (int i = 0; i < tryQuant; i++) {
            userNum = userTry(scanner);
            if (userNum == randNum) {
                System.out.println("Поздравляю! Ты угадал!");
                break;
            } else if (userNum > randNum) {
                if (i + 1 != tryQuant) {
                    System.out.println("Не угадал. Подсказка: мое число меньше твоего");
                } else {
                    youLoose(randNum);
                }
            } else if (userNum < randNum) {
                if (i + 1 != tryQuant) {
                    System.out.println("Не угадал. Подсказка: мое число больше твоего");
                } else {
                    youLoose(randNum);
                }
            }
        }
    }

    static int userTry(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                if ((userInput < 0) || (userInput > 10)) {
                    System.out.println("Введенное число должно быть в "
                            + " диапазоне 0..10. Попробуй еще раз");
                } else {
                    return userInput;
                }
            } else {
                System.out.println("Напоминаю: ввести нужно ЧИСЛО от 0 до 10. "
                        + "Попробуй еще раз");
                scanner.next();
            }
        }
    }

    static void youLoose(int randNum) {
        System.out.println("К сожалению, ты не угадал. Задуманное число - " + randNum);
    }
}
