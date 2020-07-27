package com.shepherd.warehouse.management.demo.repositories;

import com.shepherd.warehouse.management.demo.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, String> {
    @Override
    public void delete(Category category);
}
