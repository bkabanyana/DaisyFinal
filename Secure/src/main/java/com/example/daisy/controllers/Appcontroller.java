package com.example.daisy.controllers;

import com.example.daisy.control.Category;
import com.example.daisy.repository.Categoryrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
    public class Appcontroller {

        @Autowired
        private Categoryrepository categoryrepository;
        @GetMapping("/")
        public String ViewIndex(Model model)
        {

            model.addAttribute("Catlist", new Category());
            model.addAttribute("Categorylist", categoryrepository.findAll());
            return "index";
        }

    }


