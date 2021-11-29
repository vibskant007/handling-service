package com.bre.handlingservice.controller;

import com.bre.handlingservice.model.Order;
import com.bre.handlingservice.model.OrderStatusDto;
import com.bre.handlingservice.rules.impl.*;
import com.bre.handlingservice.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @Autowired
    RuleService ruleService;


    @PostMapping("/v1/api/apply-rule")
    public ResponseEntity<OrderStatusDto> applyRule(@RequestBody Order order) {

        if(order.getBook()!=null) {
            ruleService.setOrderRule(new BookOrderRule());
            return ResponseEntity.ok(ruleService.process(order));
        }

        if(order.getMembership()!=null && !order.getMembership().isActivated()) {
            ruleService.setOrderRule(new MembershipOrderRule());
            return ResponseEntity.ok(ruleService.process(order));
        }

        if(order.getMembership()!=null && !order.getMembership().isUpgraded()) {
            ruleService.setOrderRule(new UpgradeMemberShipOrderRule());
            return ResponseEntity.ok(ruleService.process(order));
        }

        if(order.getPhysicalOrder()!=null) {
            ruleService.setOrderRule(new PhysicalOrderRule());
            return ResponseEntity.ok(ruleService.process(order));
        }

        if(order.getVideo()!=null) {
            ruleService.setOrderRule(new VideoOrderRule());
            return ResponseEntity.ok(ruleService.process(order));
        }

        return ResponseEntity.ok().body(OrderStatusDto.builder().success(false).message("No Rules Configured").build());


    }
}
