package com.exo.ecommerce;

import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class Item {

    @Id
    private Long id;
    private String name;
    private String description;
    private Integer remainingInStock;
    private Float price;

    public Item() {}

    public Item(Long id, String name, String description, Integer remainingInStock, Float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.remainingInStock = remainingInStock;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getRemainingInStock() {
        return remainingInStock;
    }

    public Float getPrice() {
        return price;
    }

    public void decrementRemainingInStock() {
        this.remainingInStock--;
    }
}
