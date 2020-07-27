package com.shepherd.warehouse.management.demo.controllers;

import com.shepherd.warehouse.management.demo.repositories.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderDetailController {
    @Autowired
    OrderDetailsRepository productRepository;
}
