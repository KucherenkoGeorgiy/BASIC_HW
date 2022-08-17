package com.hillel.kucherenko.homework19.utils;

public class Rounder {

    public static double makeAmountRound(double amount) {
        amount = ((double) Math.round(amount * 100)) / 100;
        return amount;
    }
}
