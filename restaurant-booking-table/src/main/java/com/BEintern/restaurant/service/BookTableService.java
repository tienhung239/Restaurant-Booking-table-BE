package com.intern.restaurant.service;

import java.time.LocalDateTime;
import java.util.List;

import com.intern.restaurant.dto.BookTableDTO;
import com.intern.restaurant.model.BookTable;
import com.intern.restaurant.model.Category;
import com.intern.restaurant.model.Food;

public interface BookTableService {

	public BookTable createBookTable(BookTable bookTable);

	public List<BookTableDTO> listBookTable();

	public BookTable getBookTableByBookTableId(Integer btId);

	public List<BookTableDTO> getBookTableByBookTableDate(LocalDateTime dataTime);

	public boolean updateByBookTableId(Integer btId, BookTable updateBookTable);

	public void deleteByBookTableId(int id);
}
