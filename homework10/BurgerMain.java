package com.hillel.kucherenko.homework10;

public class BurgerMain {

    public static void main(String[] args) {
        IngredientGreens    ingredientGreens = new IngredientGreens();
        IngredientMeat      ingredientMeat = new IngredientMeat();
        IngredientBun       ingredientBun = new IngredientBun();
        IngredientMayonnaise ingredientMayonnaise = new IngredientMayonnaise();
        IngredientCheese    ingredientCheese = new IngredientCheese();
        IngredientMeat      ingredientAdditionalMeat = new IngredientMeat();


        Burger burgerTypical = new Burger ( ingredientBun,  ingredientCheese,
                 ingredientGreens,  ingredientMayonnaise, ingredientMeat);

        Burger burgerDiet = new Burger(ingredientBun, ingredientCheese,
                ingredientGreens, ingredientMeat);

        Burger burgerDoubleMeat = new Burger(ingredientBun, ingredientCheese,
                ingredientGreens, ingredientMayonnaise,
                ingredientMeat, ingredientAdditionalMeat);

    }

}
