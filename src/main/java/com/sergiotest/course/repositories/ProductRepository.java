package com.sergiotest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotest.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
