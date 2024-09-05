package com.example.demo.repositories;

import com.example.demo.models.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Long> {
}
