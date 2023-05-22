package com.assignment.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository repository;

    public List<Product> fetchAllProducts(){
        return repository.findAll();
    }

    public List<Product> fetchProductsOutOfWarranty(){
        return repository.findByWarrantyYearLessThan(2023);
    }

    public void addProduct(Product p){
        repository.save(p);
    }
}
