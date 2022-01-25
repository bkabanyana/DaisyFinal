package com.example.daisy.controllers;

import com.example.daisy.control.Product;
import com.example.daisy.repository.Categoryrepository;
import com.example.daisy.repository.Manufacturerepository;
import com.example.daisy.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Productcontroller {
    @Autowired

    private Productrepository productrepository;
    private Categoryrepository categoryRepository;
    private Manufacturerepository manufactureRepository;

    @GetMapping("/Products")
    public String viewPatient(Model model){
        model.addAttribute("Products", productrepository.findAll());
        return "Product";

    }

    @PostMapping("/proadd")
    public String addnewPatient(Model model, Product product){
        model.addAttribute("prodnew", new Product());
        productrepository.save(product);
        return "redirect:/Products";
    }


    @GetMapping("/deletepro/{id}")
    public String deletePatient(@PathVariable("id") Integer id){
        productrepository.deleteById(id);
        return"redirect:/Products" ;
    }

    @GetMapping("/editpro/{id}")

    public String editPatient(@PathVariable("id") Integer id, Model model){

        model.addAttribute("product", productrepository.findById(id).get());
        model.addAttribute("category" ,categoryRepository.findAll());
        return "Produpdate";

    }

}
