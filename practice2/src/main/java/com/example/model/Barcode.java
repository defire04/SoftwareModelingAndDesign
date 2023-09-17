package com.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Barcode extends BaseEntity {
    private int number;
    private Product product;

    public Barcode(int id, int number) {
        super(id);
        this.number = number;
    }

    @Override
    public String toString() {
        return "Barcode{" +
                "number=" + number +
                '}';
    }
}
