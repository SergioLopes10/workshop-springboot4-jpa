package com.sergiotest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotest.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
