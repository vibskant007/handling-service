package com.bre.handlingservice.model;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OrderStatusDto {

    private String message;
    private boolean success;

}
