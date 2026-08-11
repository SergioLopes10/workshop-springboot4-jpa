package com.sergiotest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotest.course.entities.OrderItem;
import com.sergiotest.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
