package com.example.demo.services;

import com.example.demo.models.CustomerOrder;

public interface CustomerOrderService {
    void placeOrder(CustomerOrder customerOrder);
    CustomerOrder getOrderById(Long id);
    void updateOrder(CustomerOrder customerOrder);
    void cancelOrder(Long id);
}
