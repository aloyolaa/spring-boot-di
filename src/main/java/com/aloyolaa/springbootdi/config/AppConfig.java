package com.aloyolaa.springbootdi.config;

import com.aloyolaa.springbootdi.model.InvoiceItem;
import com.aloyolaa.springbootdi.model.Product;
import com.aloyolaa.springbootdi.service.IService;
import com.aloyolaa.springbootdi.service.MyService;
import com.aloyolaa.springbootdi.service.MyService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("myService")
    public IService myService() {
        return new MyService();
    }

    @Bean("myService2")
    @Primary
    public IService myService2() {
        return new MyService2();
    }

    @Bean("SportInvoiceItems")
    public List<InvoiceItem> sportInvoiceItems() {
        Product product1 = new Product("Camara Sony", 250.00);
        Product product2 = new Product("Bicicleta", 950.00);
        InvoiceItem invoiceItem1 = new InvoiceItem(product1, 2);
        InvoiceItem invoiceItem2 = new InvoiceItem(product2, 3);
        return Arrays.asList(invoiceItem1, invoiceItem2);
    }

    @Bean("OfficeInvoiceItems")
    public List<InvoiceItem> officeInvoiceItems() {
        Product product1 = new Product("TV Samsung", 1000.00);
        Product product2 = new Product("Notebook Asus", 750.00);
        Product product3 = new Product("Desk", 150.00);
        InvoiceItem invoiceItem1 = new InvoiceItem(product1, 2);
        InvoiceItem invoiceItem2 = new InvoiceItem(product2, 3);
        InvoiceItem invoiceItem3 = new InvoiceItem(product3, 4);
        return Arrays.asList(invoiceItem1, invoiceItem2, invoiceItem3);
    }

}
