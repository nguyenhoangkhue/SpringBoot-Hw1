package com.khue.springboothw1.controller;

import com.khue.springboothw1.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private final List<Product> products;
    public ProductController() {
        products = new ArrayList<>();
        products.add(new Product(1, "IP11", "The cheapest IP", 1000,"Apple"));
        products.add(new Product(2, "IP12", "Best choice in its price range", 1500,"Apple"));
        products.add(new Product(3, "IP13", "Good one", 2000,"Apple"));
        products.add(new Product(4, "IP14", "Best choice in its price range", 4000,"Apple"));
        products.add(new Product(5, "IP15", "The most expensive one", 5000,"Apple"));
    }

    @GetMapping("/products")// http://localhost:8083/products
    public List<Product> getBooks() {
        return products;
    }
}
