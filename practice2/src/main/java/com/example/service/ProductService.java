package com.example.service;

import com.example.model.Product;
import com.example.repository.BaseRepository;

import java.util.List;

public class ProductService {
    private final BaseRepository<Product> productBaseRepository;

    public ProductService(BaseRepository< Product>  ProductBaseRepository) {
        this.productBaseRepository =  ProductBaseRepository;
    }

    public void addItemToDb( Product  Product) {
        productBaseRepository.addItemToDb( Product);
    }


    public void addItemsToDb(List< Product> ProductList) {
        productBaseRepository.addItemsToDb( ProductList);
    }


    public  Product getById(int id){
        return  productBaseRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found!"));
    }
}
