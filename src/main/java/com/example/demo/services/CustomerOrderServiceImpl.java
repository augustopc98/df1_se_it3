package com.example.demo.services;

import com.example.demo.models.CustomerOrder;
import com.example.demo.repositories.CustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    private final CustomerOrderRepository customerOrderRepository;

    @Autowired
    public CustomerOrderServiceImpl(CustomerOrderRepository customerOrderRepository) {
        this.customerOrderRepository = customerOrderRepository;
    }

    @Override
    public void placeOrder(CustomerOrder customerOrder) {
        customerOrderRepository.save(customerOrder);
    }

    @Override
    public CustomerOrder getOrderById(Long id) {
        return customerOrderRepository.findById(id).orElse(null);
    }

    @Override
    public void updateOrder(CustomerOrder customerOrder) {
        customerOrderRepository.save(customerOrder);
    }

    @Override
    public void cancelOrder(Long id) {
        customerOrderRepository.deleteById(id);
    }
}
