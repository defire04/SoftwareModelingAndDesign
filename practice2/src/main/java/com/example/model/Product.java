package com.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Product extends BaseEntity {
    private String name;
    private Barcode barcode;
    private Category category;
    private List<Customer> customers;

    public Product(int id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}