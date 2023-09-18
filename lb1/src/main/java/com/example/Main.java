package com.example;

import com.example.model.Barcode;
import com.example.model.Category;
import com.example.model.Customer;
import com.example.model.Product;
import com.example.repository.BaseRepository;
import com.example.service.BarcodeService;
import com.example.service.CategoryService;
import com.example.service.CustomerService;
import com.example.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Barcode barcodeForWater = new Barcode(1, 123);
        Barcode barcodeForBread = new Barcode(2, 234);
        Barcode barcodeForSprite = new Barcode(3, 345);

        BarcodeService barcodeService = new BarcodeService(new BaseRepository<>());
        barcodeService.addItemsToDb(List.of(
                barcodeForWater,
                barcodeForBread,
                barcodeForSprite
        ));

        Product productWater = new Product(1, "Water");
        Product productBread = new Product(2, "Bread");
        Product productSprite = new Product(3, "Sprite");


        ProductService productService = new ProductService(new BaseRepository<>());
        productService.addItemsToDb(List.of(
                productWater,
                productBread,
                productSprite
        ));

        Category categoryDrink = new Category(1, "Drink");
        Category categoryBakery = new Category(2, "Bakery");

        CategoryService categoryService = new CategoryService(new BaseRepository<>());
        categoryService.addItemsToDb(List.of(
                categoryDrink,
                categoryBakery
        ));

        Customer customerBob = new Customer(1, "Bob");
        Customer customerMark = new Customer(2, "Mark");
        Customer customerAnna = new Customer(3, "Anna");

        CustomerService customerService = new CustomerService(new BaseRepository<>());
        customerService.addItemsToDb(List.of(
                customerBob,
                customerMark,
                customerAnna
        ));

        // One to one for water
        barcodeForWater.setProduct(productWater);
        productWater.setBarcode(barcodeForWater);

        // One to many for water
        productWater.setCategory(categoryDrink);
        categoryDrink.getProducts().add(productWater);

        // Many to many
        productWater.getCustomers().add(customerBob);
        productWater.getCustomers().add(customerAnna);
        customerBob.getProducts().add(productWater);
        customerAnna.getProducts().add(productWater);


        // One to one for bread
        productBread.setBarcode(barcodeForBread);
        barcodeForBread.setProduct(productBread);

        // One to many for bread
        productBread.setCategory(categoryBakery);
        categoryBakery.getProducts().add(productBread);

        // Many to many for bread
        productBread.getCustomers().add(customerMark);
        customerMark.getProducts().add(productBread);


        // One to one for sprite
        barcodeForSprite.setProduct(productSprite);
        productSprite.setBarcode(barcodeForSprite);

        // One to many for sprite
        productSprite.setCategory(categoryDrink);
        categoryDrink.getProducts().add(productSprite);

        // Many to many for sprite
        productSprite.getCustomers().add(customerBob);
        productSprite.getCustomers().add(customerMark);
        customerBob.getProducts().add(productSprite);
        customerMark.getProducts().add(productSprite);


        productService.showInfoById(productWater.getId());
        productService.showInfo(productBread);
        productService.showInfoById(productSprite.getId());




    }
}
