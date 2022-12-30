package com.exceptionHandling.EH.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exceptionHandling.EH.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
