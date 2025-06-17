package com.nile.ecommerce.model;

public class OrderItem {
    private Integer orderItemId;
    private Integer orderId;
    private Integer productId;
    private Integer quantity;

    public OrderItem() {
    }

    public OrderItem(Integer orderId, Integer productId, Integer quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public OrderItem(Integer orderItemId, Integer orderId, Integer productId, Integer quantity) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
