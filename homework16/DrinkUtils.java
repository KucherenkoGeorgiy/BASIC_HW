package com.hillel.kucherenko.homework16;

import static com.hillel.kucherenko.homework16.DrinksApp.addDrinkToBill;

public class DrinkUtils {

    static void makeCoffee() {
        System.out.println("Your Coffee is ready");
        addDrinkToBill(new Drinks(DrinksMachine.COFFEE));
    }

    static void makeTea() {
        System.out.println("Your Tea is ready");
        addDrinkToBill(new Drinks(DrinksMachine.TEA));
    }

    static void makeLimonade() {
        System.out.println("Your Limonade is ready");
        addDrinkToBill(new Drinks(DrinksMachine.LIMONADE));
    }

    static void makeMojito() {
        System.out.println("Your Mojito is ready");
        addDrinkToBill(new Drinks(DrinksMachine.MOJITO));
    }

    static void makeWater() {
        System.out.println("Your Water is ready");
        addDrinkToBill(new Drinks(DrinksMachine.WATER));
    }

    static void makeCola() {
        System.out.println("Your Cola is ready");
        addDrinkToBill(new Drinks(DrinksMachine.COLA));
    }

}
