package com.intern.restaurant.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intern.restaurant.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByMobile(String mobile);
	Optional<User> findByEmail(String email);
	Optional<User> findByUsername(String username);
}
