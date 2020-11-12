package com.uptecsi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uptecsi.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
