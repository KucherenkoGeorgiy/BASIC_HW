package com.hillel.kucherenko.homework16;

public class Drinks {
    private static final int COFFEE = 25;
    private static final int TEA = 15;
    private static final int LIMONADE = 30;
    private static final int MOJITO = 35;
    private static final int WATER = 20;
    private static final int COLA = 25;
    private final DrinksMachine typeOfDrink;

    private int price;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return typeOfDrink.getTitle() +
                ",\t\t price - " + price + " UAH";
    }

    public Drinks(DrinksMachine typeOfDrink) {
        this.typeOfDrink = typeOfDrink;
        switch (typeOfDrink) {
            case LIMONADE:
                this.price = LIMONADE;
                break;
            case COFFEE:
                this.price = COFFEE;
                break;
            case TEA:
                this.price = TEA;
                break;
            case COLA:
                this.price = COLA;
                break;
            case WATER:
                this.price = WATER;
                break;
            case MOJITO:
                this.price = MOJITO;
                break;
        }
    }
}
