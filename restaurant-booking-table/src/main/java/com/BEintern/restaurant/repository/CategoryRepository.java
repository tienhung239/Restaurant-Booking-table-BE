package com.intern.restaurant.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intern.restaurant.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	Optional<Category> findByName(String name);
}
