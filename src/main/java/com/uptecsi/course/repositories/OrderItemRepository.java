package com.uptecsi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uptecsi.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
