package com.aloyolaa.springbootdi.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Data
@Component
public class Invoice {

    @Value("${invoice.description}")
    private String description;
    @Autowired
    private Customer customer;
    @Autowired
    @Qualifier("OfficeInvoiceItems")
    private List<InvoiceItem> items;

    Logger logger = Logger.getLogger(Invoice.class.getName());

    @PostConstruct
    public void initialize() {
        this.customer.setFirstName(this.customer.getFirstName() + " Raúl");
        this.description = this.description + ": " + this.customer.getFirstName();
    }

    @PreDestroy
    public void destroy() {
        logger.log(Level.INFO, "Destroyed Invoice: {0}", this.description);
    }

}
