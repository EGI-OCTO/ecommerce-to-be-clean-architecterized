package com.exo.ecommerce.domain.item;

public class Item {

    private Long id;
    private String name;
    private String description;
    private Integer remainingInStock;
    private Double price;

    public Item() {
    }

    public Item(Long id, String name, String description, Integer remainingInStock, Double price) {
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

    public Double getPrice() {
        return price;
    }

    public void decrementRemainingInStock() {
        this.remainingInStock--;
    }
}
