package com.bre.handlingservice.service;

import com.bre.handlingservice.model.Order;
import com.bre.handlingservice.model.Product;
import org.springframework.stereotype.Component;

@Component
public class PackagingSevice{

    public void process( Order order) {
        System.out.println("Packaging slip generated for order ");
    }
}
