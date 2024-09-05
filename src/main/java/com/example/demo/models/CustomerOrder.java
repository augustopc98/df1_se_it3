package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerEmail;
    private String customerAddress;
    private Date orderDate;
    private String deliveryStatus;

    protected CustomerOrder() {
    }

    public CustomerOrder(String customerEmail, String customerAddress, Date orderDate) {
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.orderDate = orderDate;
        this.deliveryStatus = "Pending";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void updateDeliveryStatus(String status) {
        this.deliveryStatus = status;
    }

    public void sendForDelivery() {
        this.deliveryStatus = "Out for Delivery";
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }
}
