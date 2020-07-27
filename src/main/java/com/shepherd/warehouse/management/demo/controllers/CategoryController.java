package com.shepherd.warehouse.management.demo.controllers;

import com.shepherd.warehouse.management.demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;
}
