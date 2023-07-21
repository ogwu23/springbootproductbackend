package com.productManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productManagement.model.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

}
