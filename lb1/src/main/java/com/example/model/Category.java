package com.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Category extends BaseEntity{
    private String name;
    private List<Product> products = new ArrayList<>();

    public Category(int id, String name) {
        super(id);
        this.name = name;
    }
    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
