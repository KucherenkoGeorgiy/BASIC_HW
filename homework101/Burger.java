package com.hillel.kucherenko.homework101;


public class Burger {
    int ingredientBun;
    int ingredientCheese;
    int ingredientGreens;
    int ingredientMeat;
    int ingredientMayonnaise;
    boolean additionalMeat;

    //below added typical burger (empty constructor)
    public Burger() {
        this.ingredientBun = 120;
        this.ingredientCheese = 20;
        this.ingredientGreens = 8;
        this.ingredientMeat = 80;
        this.ingredientMayonnaise = 12;
        System.out.println("You have made typical burger (default). "
                            + compositionOfBurger());
    }

    public Burger(int ingredientBun, int ingredientCheese, int ingredientGreens,
                  int ingredientMeat, int ingredientMayonnaise) {

        this.ingredientBun = ingredientBun;
        this.ingredientCheese = ingredientCheese;
        this.ingredientGreens = ingredientGreens;
        this.ingredientMeat = ingredientMeat;
        this.ingredientMayonnaise = ingredientMayonnaise;

        System.out.println("You have made your own burger. "
                            + compositionOfBurger());
    }

    public Burger(int ingredientBun, int ingredientCheese, int ingredientGreens,
                  int ingredientMeat) {

        this.ingredientBun = ingredientBun;
        this.ingredientCheese = ingredientCheese;
        this.ingredientGreens = ingredientGreens;
        this.ingredientMeat = ingredientMeat;
        System.out.println("You have made DIET burger. "
                            + compositionOfBurger());

    }

    public Burger(int ingredientBun, int ingredientCheese, int ingredientGreens,
                  int ingredientMeat, int ingredientMayonnaise,
                  boolean additionalMeat) {

        this.ingredientBun = ingredientBun;
        this.ingredientCheese = ingredientCheese;
        this.ingredientGreens = ingredientGreens;
        this.ingredientMayonnaise = ingredientMayonnaise;
        this.ingredientMeat = ingredientMeat * 2; //here we make it double
        this.additionalMeat = additionalMeat;

        System.out.println("You have made DOUBLE-MEAT burger. "
                            + compositionOfBurger());
    }

    String compositionOfBurger() {
        return "Your burger contains: \n\t"
                + "bun " + this.ingredientBun + " gr. \n\t"
                + "cheese " + this.ingredientCheese + " gr. \n\t"
                + "greens " + this.ingredientGreens + " gr. \n\t"
                + "meat " + this.ingredientMeat + " gr. \n\t"
                + (ingredientMayonnaise == 0 ? "" : "mayonnaise " + this.ingredientMayonnaise + " gr. \n\t")
                + (additionalMeat ? "and your meat is double-meat!" : "");
    }
}
