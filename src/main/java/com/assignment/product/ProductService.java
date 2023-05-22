package com.assignment.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> fetchAllProducts(){
        return repository.findAll();
    }

   public List<Product> fetchProductOutOfWarranty(){
        return repository.findByWarrantyYearLessThan(2023);
   }

}
