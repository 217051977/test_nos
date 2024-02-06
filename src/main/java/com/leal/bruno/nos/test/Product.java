package com.leal.bruno.nos.test;

public class Product {

    private String name;
    private String UID;
    private double price;

    public Product(String name, String UID, double price) {
        this.name = name;
        this.UID = UID;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getUID() {
        return UID;
    }

    public double getPrice() {
        return price;
    }

}
