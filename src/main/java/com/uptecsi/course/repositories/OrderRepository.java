package com.uptecsi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uptecsi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
