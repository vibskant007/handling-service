package com.bre.handlingservice.model;


import java.util.UUID;

public class Product {

    private String productName;

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    private UUID productId;

    public Product(String productName, ProductType productType) {
        this.productName = productName;
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    private ProductType productType;
}
