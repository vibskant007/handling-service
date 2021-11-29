package com.bre.handlingservice.rules.impl;

import com.bre.handlingservice.model.Order;
import com.bre.handlingservice.model.OrderStatusDto;
import com.bre.handlingservice.model.PhysicalOrder;
import com.bre.handlingservice.rules.OrderRule;
import com.bre.handlingservice.service.CommisionService;
import com.bre.handlingservice.service.PackagingSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhysicalOrderRule implements OrderRule {

    @Autowired
    PackagingSevice packagingSevice;

    @Autowired
    CommisionService commisionService;

    @Override
    public OrderStatusDto handleOrder(Order order) {
        packagingSevice.process(order);
        commisionService.calculateCommision(order.getPhysicalOrder().getPrice());

        return OrderStatusDto.builder().success(true).message("Success ....  ").build();

    }
}
