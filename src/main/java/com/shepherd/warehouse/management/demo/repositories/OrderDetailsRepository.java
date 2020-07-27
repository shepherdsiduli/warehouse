package com.shepherd.warehouse.management.demo.repositories;

import com.shepherd.warehouse.management.demo.models.OrderDetails;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, String> {
    @Override
    public void delete(OrderDetails orderDetails);
}
