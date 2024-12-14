package com.learn.multiple_databases;

import com.learn.multiple_databases.entity.Product;
import com.learn.multiple_databases.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultipleDatabasesApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(MultipleDatabasesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product(1001L, "Laptop", "Gaming Laptop");
//		product.setId(1001L);
//		product.setName("Laptop");
//		product.setDescription("Gaming Laptop");
		productRepo.save(product);
		System.out.println("Saved product in DB");

	}
}
