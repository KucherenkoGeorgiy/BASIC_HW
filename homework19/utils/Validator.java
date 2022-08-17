package com.hillel.kucherenko.homework19.utils;

import java.util.Scanner;

public class Validator {

    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Empty! Enter name of Product: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    public static int validateQuantityInput(Scanner scanner) {
        while (true) {
            if (!scanner.hasNextInt()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - is not numeric!\n", str);
                System.out.println("Enter quantity!: ");
                continue;
            }
            int quantity = scanner.nextInt();
            if (quantity <= 0) {
                System.out.println("Wrong value! Enter quantity: ");
                continue;
            }
            return quantity;
        }
    }

    public static float validatePriceInput(Scanner scanner) {
        while (true) {
            if (!scanner.hasNextFloat()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - not numeric!\n", str);
                System.out.println("Enter the price!: ");
                continue;
            }
            float price = scanner.nextFloat();
            if (price <= 0) {
                System.out.println("Wrong value! Enter the price: ");
                continue;
            }
            return price;
        }
    }
}

