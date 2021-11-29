package com.bre.handlingservice.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public enum ProductType {
    BOOK,PHYSICAL,MEMBERSHIP,UPGRADE,VIDEO;
}
