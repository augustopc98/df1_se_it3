package com.example.demo.controllers;

import com.example.demo.models.CustomerOrder;
import com.example.demo.services.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/orders")
public class CustomerOrderController {

    private final CustomerOrderService customerOrderService;

    @Autowired
    public CustomerOrderController(CustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
    }

    @PostMapping
    public String placeOrder(@RequestBody CustomerOrder customerOrder) {
        customerOrderService.placeOrder(customerOrder);
        return "Order placed successfully.";
    }

    @GetMapping("/{id}")
    public CustomerOrder getOrderById(@PathVariable Long id) {
        return customerOrderService.getOrderById(id);
    }

    @PutMapping("/{id}")
    public String updateOrder(@PathVariable Long id, @RequestBody CustomerOrder customerOrder) {
        customerOrder.setId(id);
        customerOrderService.updateOrder(customerOrder);
        return "Order updated successfully.";
    }

    @DeleteMapping("/{id}")
    public String cancelOrder(@PathVariable Long id) {
        customerOrderService.cancelOrder(id);
        return "Order cancelled successfully.";
    }
}
