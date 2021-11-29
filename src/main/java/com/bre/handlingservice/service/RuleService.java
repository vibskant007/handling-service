package com.bre.handlingservice.service;


import com.bre.handlingservice.model.OrderStatusDto;
import com.bre.handlingservice.model.Product;
import com.bre.handlingservice.rules.OrderRule;
import org.springframework.stereotype.Component;

@Component
public class RuleService<T extends Product> {

    private OrderRule orderRule;

   public void setOrderRule(OrderRule orderRule) {
       this.orderRule = orderRule;
   }

   public OrderStatusDto process(T order) {
       return orderRule.handleOrder(order);
   }

}
