package com.BEintern.restaurantbookingtable.repository;

import com.BEintern.restaurantbookingtable.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface extends JpaRepository<Users,Integer> {

}
