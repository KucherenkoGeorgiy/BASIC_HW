package com.hillel.kucherenko.homework6;

import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {
        int randNum = (int) (Math.random() * 11);
        int userNum;
        int tryQuant = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("� ������� ����� �� 0 �� 10.. �������� ���. � ���� 3 �������");
        for (int i = 0; i < tryQuant; i++) {
            userNum = userTry(scanner);
            if (userNum == randNum) {
                System.out.println("����������! �� ������!");
                break;
            } else if (userNum > randNum) {
                if (i + 1 != tryQuant) {
                    System.out.println("�� ������. ���������: ��� ����� ������ ������");
                } else {
                    youLoose(randNum);
                }
            } else if (userNum < randNum) {
                if (i + 1 != tryQuant) {
                    System.out.println("�� ������. ���������: ��� ����� ������ ������");
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
                    System.out.println("��������� ����� ������ ���� � "
                            + " ��������� 0..10. �������� ��� ���");
                } else {
                    return userInput;
                }
            } else {
                System.out.println("���������: ������ ����� ����� �� 0 �� 10. "
                        + "�������� ��� ���");
                scanner.next();
            }
        }
    }

    static void youLoose(int randNum) {
        System.out.println("� ���������, �� �� ������. ���������� ����� - " + randNum);
    }
}
