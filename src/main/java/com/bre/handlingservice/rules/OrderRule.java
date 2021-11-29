package com.bre.handlingservice.rules;

import com.bre.handlingservice.model.Order;
import com.bre.handlingservice.model.OrderStatusDto;

public interface OrderRule {
    public OrderStatusDto handleOrder(Order order);
}
