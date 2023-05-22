package com.assignment.product;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductApplication.class, args);

		ProductService service = context.getBean(ProductService.class);

		System.out.println("------------------------------------------------------------");

		List<Product> products = service.fetchAllProducts();
		for (Product p : products) {
			System.out.println(p);
		}

			System.out.println("------------------------------------------------------------");

			products = service.fetchProductOutOfWarranty();
			for (Product p : products) {
				System.out.println(p);
		}
	}
}


