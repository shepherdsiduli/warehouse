package com.shepherd.warehouse.management.demo.controllers;

import com.shepherd.warehouse.management.demo.models.Supplier;
import com.shepherd.warehouse.management.demo.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class SupplierController {

    @Autowired
    SupplierRepository supplierRepository;

    @RequestMapping("/suppliers/supplier")
    public String product(Model model) {
        model.addAttribute("suppliers", supplierRepository.findAll());
        return "supplier";
    }

    @RequestMapping("/suppliers/create")
    public String create(Model model) {
        return "create";
    }

    @RequestMapping("/suppliers/save")
    public String save(@RequestParam String prodName, @RequestParam String prodDesc, @RequestParam Double prodPrice, @RequestParam String prodImage) {
        Supplier supplier = new Supplier();
        supplier.setProdName(prodName);
        supplier.setProdDesc(prodDesc);
        supplier.setProdPrice(prodPrice);
        supplier.setProdImage(prodImage);
        supplierRepository.save(supplier);

        return "redirect:/show/" + supplier.getSupplierId();
    }

    @RequestMapping("/suppliers/show/{id}")
    public String show(@PathVariable String id, Model model) {
        model.addAttribute("supplier", supplierRepository.findById(id).get());
        return "show";
    }

    @RequestMapping("/suppliers/delete")
    public String delete(@RequestParam String id) {
        Optional<Supplier> supplier = supplierRepository.findById(id);
        supplierRepository.delete(supplier.get());

        return "redirect:/supplier";
    }

    @RequestMapping("/suppliers/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("product", supplierRepository.findById(id).get());
        return "edit";
    }

    @RequestMapping("/suppliers/update")
    public String update(@RequestParam String id, @RequestParam String prodName, @RequestParam String prodDesc, @RequestParam Double prodPrice, @RequestParam String prodImage) {
        Optional<Supplier> supplier = supplierRepository.findById(id);
        supplier.get().setProdName(prodName);
        supplier.get().setProdDesc(prodDesc);
        supplier.get().setProdPrice(prodPrice);
        supplier.get().setProdImage(prodImage);
        supplierRepository.save(supplier.get());

        return "redirect:/show/" + supplier.get().getSupplierId();
    }
}
