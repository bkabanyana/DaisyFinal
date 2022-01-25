package com.example.daisy.control;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer Pro_Id;
        @Column(nullable = false, length = 40)
        String Pro_name;
        @ManyToOne
        @JoinColumn(name = "category_cat_id")
        Category Category;
        @ManyToOne
        @JoinColumn(name = "manufacture_man_id")
        Manufacture Manufacture;

    }


