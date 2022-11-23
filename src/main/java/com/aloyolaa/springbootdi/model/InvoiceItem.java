package com.aloyolaa.springbootdi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InvoiceItem {

    private Product product;
    private Integer amount;

    public Double calculateTotal() {
        return this.amount * this.product.getPrice();
    }

}
