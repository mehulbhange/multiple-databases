package com.learn.multiple_databases.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Long id;
    private String name;
    private String description;

    public Order() {
    }

    public Order(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
