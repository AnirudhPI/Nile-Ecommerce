package com.nile.ecommerce.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {
    private Integer orderId;
    private Integer customerId;
    private BigDecimal totalPrice;
    private LocalDateTime timestamp;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer customerId) {
        this.customerId = customerId;
        this.status = OrderStatus.PENDING;
        this.timestamp = LocalDateTime.now();
    }

    public Order(Integer orderId, Integer customerId, BigDecimal totalPrice,
                 LocalDateTime timestamp, OrderStatus status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.totalPrice = totalPrice;
        this.timestamp = timestamp;
        this.status = status;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
