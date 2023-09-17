package com.example.service;

import com.example.model. Customer;
import com.example.repository.BaseRepository;

import java.util.List;

public class CustomerService {
    private final BaseRepository<Customer> customerBaseRepository;

    public CustomerService(BaseRepository< Customer>  CustomerBaseRepository) {
        this.customerBaseRepository =  CustomerBaseRepository;
    }

    public void addItemToDb( Customer  Customer) {
         customerBaseRepository.addItemToDb( Customer);
    }


    public void addItemsToDb(List< Customer>  CustomerList) {
         customerBaseRepository.addItemsToDb( CustomerList);
    }


    public  Customer getById(int id){
        return  customerBaseRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found!"));
    }
}
