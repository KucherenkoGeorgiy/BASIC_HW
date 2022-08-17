package com.hillel.kucherenko.homework19.models;

import com.hillel.kucherenko.homework19.base.Fiscal;
import com.hillel.kucherenko.homework19.base.Income;

public class Product implements Income, Fiscal {
    private String name;
    private int quantity;
    private double price;
    private final static double TAX_RATE = 0.05;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculateTaxesOfIncome() {
        return quantity * price * TAX_RATE;
    }

    @Override
    public double calculateIncome() {
        return quantity * price;
    }

    @Override
    public double calculateNetIncome() {
        return this.calculateIncome() - this.calculateTaxesOfIncome();
    }
}
