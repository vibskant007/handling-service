package com.bre.handlingservice.rules.impl;

import com.bre.handlingservice.model.Membership;
import com.bre.handlingservice.model.Order;
import com.bre.handlingservice.model.OrderStatusDto;
import com.bre.handlingservice.rules.OrderRule;
import com.bre.handlingservice.service.EmailService;
import com.bre.handlingservice.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MembershipOrderRule implements OrderRule {

    @Autowired
    MembershipService membershipService;

    @Autowired
    EmailService emailService;

    @Override
    public OrderStatusDto handleOrder(Order order) {
        membershipService.activateMembership(order);
        emailService.sendEmail(order.getMembership());
        return OrderStatusDto.builder().success(true).message("Membership activated & Email Sent!").build();
    }
}
