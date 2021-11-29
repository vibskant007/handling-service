package com.bre.handlingservice.model;

public class Book extends Product{

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;

    public Book(String productName, ProductType productType,double price) {
        super(productName, productType);
        this.price = price;
    }


}
