package com.intern.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intern.restaurant.model.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer>{

}
