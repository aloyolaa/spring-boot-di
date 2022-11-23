package com.aloyolaa.springbootdi.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Customer {

    @Value("${customer.firstname}")
    private String firstName;
    @Value("${customer.lastname}")
    private String lastName;

}
