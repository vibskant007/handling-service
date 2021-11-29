package com.bre.handlingservice.model;

import java.util.Date;

public class Video extends Product{
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    public Video(String productName, ProductType productType) {
        super(productName, productType);
    }
}
