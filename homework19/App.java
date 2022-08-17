package com.hillel.kucherenko.homework19;

import com.hillel.kucherenko.homework19.controllers.ProductController;
import com.hillel.kucherenko.homework19.models.Product;
import com.hillel.kucherenko.homework19.views.SalesView;

public class App {

    public static void main(String[] args) {
        Product model = new Product();
        SalesView view = new SalesView(model);
        ProductController controller = new ProductController(model, view);

        controller.runApp();
    }
}
