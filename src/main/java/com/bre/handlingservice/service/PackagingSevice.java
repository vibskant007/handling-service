package com.bre.handlingservice.service;

import com.bre.handlingservice.model.Product;
import org.springframework.stereotype.Component;

@Component
public class PackagingSevice<T extends Product>{

    public void process( T order) {
        System.out.println("Packaging slip generated for order ");
    }
}
