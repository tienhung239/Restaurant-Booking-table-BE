package com.intern.restaurant.service;

import java.util.List;

import com.intern.restaurant.dto.CategoryDTO;
import com.intern.restaurant.model.Category;


public interface CategoryService {
	public List<CategoryDTO> listCategory();
	public Category createCategory(Category category); 
	
	public boolean updateCategoryName(String name, String newname);
	public boolean updateCategoryDescription(String name, String description);
	public boolean updateCategoryImageLink(String name, String img_link);
	public boolean updateCategoryType(String name, int type);
	public boolean updateCategory(String name, Category updateCategory);
	
	public void deleteById(int id);
	public void deleteByName(String name);
}
