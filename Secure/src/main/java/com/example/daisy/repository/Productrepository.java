package com.example.daisy.repository;

import com.example.daisy.control.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepository extends JpaRepository <Product, Integer> {
}
