package com.hillel.kucherenko.homework101;

public class BurgerMain {

    public static void main(String[] args) {
        Burger burgerTypical = new Burger();
        Burger burgerCustom = new Burger(100, 30, 20, 40, 40);
        Burger burgerDiet = new Burger(100, 20, 30, 20);
        Burger burgerDoubleMeat = new Burger(100, 30, 20, 40, 40, true);

    }
}
