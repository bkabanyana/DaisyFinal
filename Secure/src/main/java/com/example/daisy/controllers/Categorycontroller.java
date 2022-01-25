package com.example.daisy.controllers;

import com.example.daisy.control.Category;
import com.example.daisy.repository.Categoryrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Categorycontroller {
    @Autowired

    private Categoryrepository catrepository;

    @GetMapping("/Categories")
    public String viewPatient(Model model){
        model.addAttribute("Categories", catrepository.findAll());
        return "Categories";


    }

    @PostMapping("/catadd")
    public String newCategory (Category category, Model model){
        model.addAttribute("updatedcat", new Category());
        catrepository.save(category);
        return "redirect:/Categories";
    }

    @GetMapping("/deletecat/{id}")
    public String deletecategory(@PathVariable("id") Integer id){
        catrepository.deleteById(id);
        return"redirect:/Categories" ;

    }

    @GetMapping("/editcat/{id}")
    public String editDoctor(@PathVariable("id") Integer id, Model model){

        model.addAttribute("category", catrepository.findById(id).get());
        model.addAttribute("categs" ,catrepository.findAll());
        return "Catupdate";
    }

}
