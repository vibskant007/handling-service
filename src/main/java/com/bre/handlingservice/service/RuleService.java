package com.bre.handlingservice.service;

import com.bre.handlingservice.model.Order;
import com.bre.handlingservice.model.OrderStatusDto;
import com.bre.handlingservice.rules.OrderRule;
import org.springframework.stereotype.Component;

@Component
public class RuleService {

    private OrderRule orderRule;

   public void setOrderRule(OrderRule orderRule) {
       this.orderRule = orderRule;
   }

   public OrderStatusDto process(Order order) {
       return orderRule.handleOrder(order);
   }

}
