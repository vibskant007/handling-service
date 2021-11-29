package com.bre.handlingservice.rules;

import com.bre.handlingservice.model.OrderStatusDto;
import com.bre.handlingservice.model.Product;

public interface OrderRule<T extends Product> {
    public OrderStatusDto handleOrder(T order);
}
