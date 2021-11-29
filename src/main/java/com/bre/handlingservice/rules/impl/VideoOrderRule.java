package com.bre.handlingservice.rules.impl;

import com.bre.handlingservice.model.Order;
import com.bre.handlingservice.model.OrderStatusDto;
import com.bre.handlingservice.rules.OrderRule;
import org.springframework.stereotype.Component;

@Component
public class VideoOrderRule implements OrderRule {


    @Override
    public OrderStatusDto handleOrder(Order order) {
       //logic to add a free “First Aid” video to the packing slip
        return OrderStatusDto.builder().success(true).message("Added a free “First Aid” video to the packing slip!").build();
    }
}
