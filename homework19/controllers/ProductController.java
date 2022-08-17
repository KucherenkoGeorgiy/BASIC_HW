package com.hillel.kucherenko.homework19.controllers;

import com.hillel.kucherenko.homework19.models.Product;
import com.hillel.kucherenko.homework19.utils.Rounder;
import com.hillel.kucherenko.homework19.views.SalesView;

public class ProductController {
    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        view.getInputs();
        String name = this.model.getName();
        double income = this.model.calculateIncome();
        String incomeRounded = Double.toString(Rounder.makeAmountRound(income));
        double tax = this.model.calculateTaxesOfIncome();
        String taxRounded = Double.toString(Rounder.makeAmountRound(tax));
        String netIncomeRounded = Double.toString(Rounder.makeAmountRound(this.model.calculateNetIncome()));
        String output = "Name of Product: " + name + "\nTotal income (UAH): "
                + incomeRounded + "\nAmount of Taxes (UAH): " + taxRounded + "\nNet Income (UAH): "
                + netIncomeRounded;

        view.getOutput(output);
    }
}
