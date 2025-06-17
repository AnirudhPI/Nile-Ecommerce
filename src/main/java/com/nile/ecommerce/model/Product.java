package com.nile.ecommerce.model;

import java.math.BigDecimal;

public class Product {
    private Integer productId;
    private String productName;
    private BigDecimal price;
    private Integer availableQuantity;

    public Product() {
    }

    public Product(Integer productId, String productName, BigDecimal price, Integer availableQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public Product(String productName, BigDecimal price, Integer availableQuantity) {
        this.productName = productName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
