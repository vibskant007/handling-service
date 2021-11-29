package com.bre.handlingservice.service;

import org.springframework.stereotype.Component;

@Component
public class CommisionService {

    public double calculateCommision(double price) {
        return 20.0;
    }
}
