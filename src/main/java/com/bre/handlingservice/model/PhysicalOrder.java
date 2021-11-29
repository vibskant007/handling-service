package com.bre.handlingservice.model;

public class PhysicalOrder extends Product {
    private String name;

    public PhysicalOrder(String productName, ProductType productType) {
        super(productName, productType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    private String description;
    private double price;
    private String quantity;

}
