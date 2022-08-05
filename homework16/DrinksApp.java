package com.hillel.kucherenko.homework16;

import java.util.Arrays;
import java.util.Scanner;

import static com.hillel.kucherenko.homework16.DrinkUtils.*;

public class DrinksApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static String drinksAssortment;
    private static final DrinksMachine[] drinksMachineValues = DrinksMachine.values();
    private static Drinks[] arrayOfUsersDrinks = new Drinks[]{};
    private static boolean isCorrectInput = false;
    private static String currentUsersDrink;
    private static int totalCostOfUsersOrder;
    private static int quantityOfOrderedDrinks;


    public static void main(String[] args) {
        start();
        printUsersBill();
    }

    private static void start() {
        for (DrinksMachine value :
                drinksMachineValues) {
            drinksAssortment += value.ordinal() + " " + value + " ("
                    + value.getTitle() + ") \n";
        }
        while (true) {
            System.out.println("What Drink would you like? We have: ");
            System.out.println(drinksAssortment);
            System.out.println("Please type one of these..: "
                    + Arrays.toString(drinksMachineValues));
            getUsersChoiceOfDrink();
            DrinksMachine drinksMachine = DrinksMachine.valueOf(currentUsersDrink);
            switch (drinksMachine) {
                case TEA:
                    makeTea();
                    break;
                case COLA:
                    makeCola();
                    break;
                case WATER:
                    makeWater();
                    break;
                case COFFEE:
                    makeCoffee();
                    break;
                case MOJITO:
                    makeMojito();
                    break;
                case LIMONADE:
                    makeLimonade();
                    break;
            }
            System.out.println("Need one more drink? type \"NO\" if don't need.. " +
                    "Or type anything else to order one more drink");
            if (scanner.nextLine().toUpperCase().equals("NO")) {
                break;
            }
        }
    }

    private static void getUsersChoiceOfDrink() {
        while (!isCorrectInput) {
            currentUsersDrink = scanner.nextLine().toUpperCase();
            isCorrectInput = checkUsersInput(currentUsersDrink);
            if (!isCorrectInput) {
                System.out.println("Please input correct value");
            }
        }
        isCorrectInput = false;
    }


    private static boolean checkUsersInput(String usersInput) {
        for (DrinksMachine value :
                drinksMachineValues) {
            if (value.toString().equals(usersInput)) {
                return true;
            }
        }
        return false;
    }


    static void addDrinkToBill(Drinks usersDrink) {
        if (arrayOfUsersDrinks == null) {
            arrayOfUsersDrinks = new Drinks[1];
            arrayOfUsersDrinks[0] = usersDrink;
        } else {
            arrayOfUsersDrinks = increaseArrayOfUsersDrinks(arrayOfUsersDrinks);
            arrayOfUsersDrinks[arrayOfUsersDrinks.length - 1] = usersDrink;
        }
    }

    private static Drinks[] increaseArrayOfUsersDrinks(Drinks[] arrayOfUsersDrinks) {
        Drinks[] tempArrayOfUsersDrinks = new Drinks[arrayOfUsersDrinks.length + 1];
        for (int i = 0; i < arrayOfUsersDrinks.length; i++) {
            tempArrayOfUsersDrinks[i] = arrayOfUsersDrinks[i];
        }
        return tempArrayOfUsersDrinks;
    }

    private static void printUsersBill() {
        System.out.println("===========================");
        System.out.println("Your order:");
        for (int i = 0; i < arrayOfUsersDrinks.length; i++) {
            System.out.println((i + 1) + ". \t" + arrayOfUsersDrinks[i]);
            totalCostOfUsersOrder += arrayOfUsersDrinks[i].getPrice();
            quantityOfOrderedDrinks++;
        }
        System.out.println("===========================");
        System.out.println("You have ordered " + quantityOfOrderedDrinks
                + " drinks. Total cost is " + totalCostOfUsersOrder + " UAH");
    }
}
