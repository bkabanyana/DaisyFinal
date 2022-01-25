package com.example.daisy.repository;

import com.example.daisy.control.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Categoryrepository extends JpaRepository <Category, Integer> {
}
