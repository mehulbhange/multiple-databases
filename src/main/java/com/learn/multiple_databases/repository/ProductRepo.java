package com.learn.multiple_databases.repository;

import com.learn.multiple_databases.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
}
