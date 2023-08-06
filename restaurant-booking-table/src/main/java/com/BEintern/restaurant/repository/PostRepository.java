package com.intern.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intern.restaurant.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
