package com.assignment.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ProductApplication.class, args);

		ProductServices services = context.getBean(ProductServices.class);

		System.out.println("----------------------------------------------------------------------");

		List<Product> allProducts = services.fetchAllProducts();
		for(Product p : allProducts){
			System.out.println(p);
		}

		System.out.println("----------------------------------------------------------------------");

		List<Product> outOfWarrantyProducts = services.fetchProductsOutOfWarranty();
		for(Product p : outOfWarrantyProducts){
			System.out.println(p);
		}

		System.out.println("----------------------------------------------------------------------");

		services.addProduct(new Product(18 ,"Stream Deck","Streaming Device","Main Desk",2026));

	}

}
