package com.bre.handlingservice.rules.impl;

import com.bre.handlingservice.model.Membership;
import com.bre.handlingservice.model.OrderStatusDto;
import com.bre.handlingservice.rules.OrderRule;
import com.bre.handlingservice.service.EmailService;
import com.bre.handlingservice.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MembershipOrderRule implements OrderRule<Membership> {

    @Autowired
    MembershipService membershipService;

    @Autowired
    EmailService emailService;

    @Override
    public OrderStatusDto handleOrder(Membership membership) {
        membershipService.activateMembership(membership);
        emailService.sendEmail(membership);
        return OrderStatusDto.builder().success(true).message("Success ....  ").build();
    }
}
