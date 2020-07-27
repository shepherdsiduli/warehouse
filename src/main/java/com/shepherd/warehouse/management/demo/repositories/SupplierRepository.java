package com.shepherd.warehouse.management.demo.repositories;

import com.shepherd.warehouse.management.demo.models.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends CrudRepository<Supplier, String> {
    @Override
    public void delete(Supplier supplier);
}