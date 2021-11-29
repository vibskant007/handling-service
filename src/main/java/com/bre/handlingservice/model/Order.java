package com.bre.handlingservice.model;

public class Order {

    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    private boolean status;

    private Membership membership;

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public PhysicalOrder getPhysicalOrder() {
        return physicalOrder;
    }

    public void setPhysicalOrder(PhysicalOrder physicalOrder) {
        this.physicalOrder = physicalOrder;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    private Book book;

    private PhysicalOrder physicalOrder;

    private Video video;



}
