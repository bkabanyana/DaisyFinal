package com.example.daisy.controllers;

import com.example.daisy.control.Manufacture;
import com.example.daisy.repository.Manufacturerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Manufacturecontroller {


        @Autowired
        private Manufacturerepository Manrepository;
        @GetMapping("/Manufactures")
        public String viewPatient(Model model){
            model.addAttribute("Manufactures", Manrepository.findAll());
            return "Manufactures";


        }

        @PostMapping("/Manadd")

        public String addnewNurse(Model model, Manufacture manufact){
            model.addAttribute("Manapt", new Manufacture());
            Manrepository.save(manufact);
            return "redirect:/Manufactures";

        }

        @GetMapping("/deleteman/{id}")
        public String deleteNurse(@PathVariable("id") Integer id){
            Manrepository.deleteById(id);
            return"redirect:/Manufactures" ;
        }

        @GetMapping("/editman/{id}")

        public String editPatient(@PathVariable("id") Integer id, Model model){
            model.addAttribute("manufact", Manrepository.findById(id).get());
            model.addAttribute("Manufacturing" ,Manrepository.findAll());
            return "Manupdate";
        }

    }


