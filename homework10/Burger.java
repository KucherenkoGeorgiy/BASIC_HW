package com.hillel.kucherenko.homework10;

public class Burger {
    IngredientBun ingredientBun;
    IngredientCheese ingredientCheese;
    IngredientGreens ingredientGreens;
    IngredientMayonnaise ingredientMayonnaise;
    IngredientMeat ingredientMeat;
    IngredientMeat additionalMeat;

    public Burger(IngredientBun ingredientBun, IngredientCheese ingredientCheese,
                  IngredientGreens ingredientGreens, IngredientMayonnaise ingredientMayonnaise,
                  IngredientMeat ingredientMeat) {
        this.ingredientBun = ingredientBun;
        this.ingredientCheese = ingredientCheese;
        this.ingredientGreens = ingredientGreens;
        this.ingredientMayonnaise = ingredientMayonnaise;
        this.ingredientMeat = ingredientMeat;

        System.out.println("You have just made typical Burger.. It contains: \n "
                + "Bun, Cheese, Greens, Mayonnaise, Meet!\n");
    }

    public Burger(IngredientBun ingredientBun, IngredientCheese ingredientCheese,
                  IngredientGreens ingredientGreens, IngredientMeat ingredientMeat) {
        this.ingredientBun = ingredientBun;
        this.ingredientCheese = ingredientCheese;
        this.ingredientGreens = ingredientGreens;
        this.ingredientMeat = ingredientMeat;

        System.out.println("You have just made Diet Burger.. It contains: \n "
                + "Bun, Cheese, Greens, Meet!\n");
    }

    public Burger(IngredientBun ingredientBun, IngredientCheese ingredientCheese,
                  IngredientGreens ingredientGreens, IngredientMayonnaise ingredientMayonnaise,
                  IngredientMeat ingredientMeat, IngredientMeat additionalMeat) {
        this.ingredientBun = ingredientBun;
        this.ingredientCheese = ingredientCheese;
        this.ingredientGreens = ingredientGreens;
        this.ingredientMayonnaise = ingredientMayonnaise;
        this.ingredientMeat = ingredientMeat;
        this.additionalMeat = additionalMeat;

        System.out.println("You have just made \"Double-Meat Burger\".. It contains: \n "
                + "Bun, Cheese, Greens, Mayonnaise, Double Meet!\n");

    }
}
