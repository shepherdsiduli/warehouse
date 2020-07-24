/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shepherd.warehouse.management.demo.controllers;

import com.shepherd.warehouse.management.demo.models.Product;
import org.junit.jupiter.api.Test;

/**
 *
 * @author shepherdsiduli
 */
public class ProductControllerTest {
    
    
    @Test
    public void testsCreateProduct(){
        Product product = new Product();
        
       assert(product != null);
    }
    
}
