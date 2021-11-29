package com.bre.handlingservice.controller;


import com.bre.handlingservice.model.Book;
import com.bre.handlingservice.model.OrderStatusDto;
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
    public ResponseEntity<OrderStatusDto> applyRule(@RequestBody Book book) {
        return ResponseEntity.ok(ruleService.process(book));
    }
}
