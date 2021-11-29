package com.bre.handlingservice.rules.impl;

import com.bre.handlingservice.model.Book;
import com.bre.handlingservice.model.OrderStatusDto;
import com.bre.handlingservice.rules.OrderRule;
import com.bre.handlingservice.service.CommisionService;
import com.bre.handlingservice.service.PackagingSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookOrderRule implements OrderRule<Book> {

    @Autowired
    PackagingSevice packagingSevice;

    @Autowired
    CommisionService commisionService;


    @Override
    public OrderStatusDto handleOrder(Book order) {
       packagingSevice.process(order);
       commisionService.calculateCommision(order.getPrice());

       return OrderStatusDto.builder().success(true).message("Success ....  ").build();

    }
}
