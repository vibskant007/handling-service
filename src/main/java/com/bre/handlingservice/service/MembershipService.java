package com.bre.handlingservice.service;

import com.bre.handlingservice.model.Membership;
import com.bre.handlingservice.model.Order;
import com.bre.handlingservice.model.Product;
import org.springframework.stereotype.Component;


@Component
public class MembershipService {

    public void activateMembership(Order membership) {
        System.out.println("MemberShip Activated");
    }

    public void upgradeMembership(Order upgradeMembership) {
        System.out.println("MemberShip Upgraded");
    }

}
