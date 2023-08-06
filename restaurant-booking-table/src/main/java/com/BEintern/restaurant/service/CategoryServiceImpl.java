package com.intern.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.restaurant.dto.CategoryDTO;
import com.intern.restaurant.exception.CategoryException;
import com.intern.restaurant.mapper.CategoryMapper;
import com.intern.restaurant.model.Category;
import com.intern.restaurant.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<CategoryDTO> listCategory() {
		// TODO Auto-generated method stub
		List<CategoryDTO> listCategoryDTOs = new ArrayList<>();
		for (Category category: categoryRepository.findAll()) {
			listCategoryDTOs.add(CategoryMapper.toCategoryDTO(category));
		}
		if (listCategoryDTOs.size() == 0)
			throw new CategoryException("Category not found");
		return listCategoryDTOs;
	}

	@Override
	public Category createCategory(Category category) {
		// TODO Auto-generated method stub
		Optional<Category> o_category = categoryRepository.findByName(category.getName());
		if (o_category.isPresent()) {
			throw new CategoryException("Category already exists");
		}
		return categoryRepository.save(category);
	}

	@Override
	public boolean updateCategoryName(String name, String newname) {
		// TODO Auto-generated method stub
		Optional<Category> o_category = categoryRepository.findByName(name);
		if (!o_category.isPresent())
			return false;
		if (categoryRepository.findByName(newname).isPresent())
			return false;
		Category category = o_category.get();
		category.setName(newname);
		categoryRepository.save(category);
		return true;
	}

	@Override
	public boolean updateCategoryDescription(String name, String description) {
		// TODO Auto-generated method stub
		Optional<Category> o_category = categoryRepository.findByName(name);
		if (o_category.isPresent()) {
			Category category = o_category.get();
			category.setDescription(description);
			categoryRepository.save(category);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateCategoryImageLink(String name, String img_link) {
		// TODO Auto-generated method stub
		Optional<Category> o_category = categoryRepository.findByName(name);
		if (o_category.isPresent()) {
			Category category = o_category.get();
			category.setImage_link(img_link);
			categoryRepository.save(category);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateCategoryType(String name, int type) {
		// TODO Auto-generated method stub
		Optional<Category> o_category = categoryRepository.findByName(name);
		if (o_category.isPresent()) {
			Category category = o_category.get();
			category.setType(type);
			categoryRepository.save(category);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateCategory(String name, Category updateCategory) {
		// TODO Auto-generated method stub
		Optional<Category> o_category = categoryRepository.findByName(name);
		if (o_category.isPresent()) {
			if (categoryRepository.findByName(updateCategory.getName()).isPresent())
				return false;
			else {
				Category category = o_category.get();
				category.setName(updateCategory.getName());
				category.setImage_link(updateCategory.getImage_link());
				category.setDescription(updateCategory.getDescription());
				category.setType(updateCategory.getType());
				categoryRepository.save(category);
				return true;
			}
		}
		return false;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
		
	}

	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		Optional<Category> o_category = categoryRepository.findByName(name);
		if (!o_category.isPresent()) 
			throw new CategoryException("Category not found");
		categoryRepository.deleteById(o_category.get().getCf_id());
	}

}
