package com.intern.restaurant.repository;

import com.intern.restaurant.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intern.restaurant.model.BookTable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookTableRepository extends JpaRepository<BookTable, Integer>{
//    Optional<BookTable> findByBt_id(Integer btId);
    List<BookTable> findByDatetime(LocalDateTime dateTime);
}
