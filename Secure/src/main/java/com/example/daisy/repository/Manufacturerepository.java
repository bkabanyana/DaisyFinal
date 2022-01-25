package com.example.daisy.repository;

import com.example.daisy.control.Manufacture;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface Manufacturerepository extends JpaRepository <Manufacture, Integer> {
}
