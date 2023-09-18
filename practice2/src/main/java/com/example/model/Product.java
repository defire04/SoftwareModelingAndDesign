package com.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Product extends BaseEntity {
    private String name;
    private Barcode barcode;
    private Category category;
    private List<Customer> customers = new ArrayList<>();

    public Product(int id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", \n\tbarcode=" + barcode +
                ", \n\tcategory=" + category +
                ", \n\tcustomers=" + customers +
                '}';
    }
}