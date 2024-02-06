package com.leal.bruno.nos.test.pages;

import com.leal.bruno.nos.test.Product;

import java.util.List;

public class ProductListPage {

    public List<Product> getAll() {
        return List.of(new Product("bag", "asda3453sad", 19.99));
    }

    public Product get(String productUID) {
        return new Product("bag", "asda3453sad", 19.99);
    }

}
