package com.intern.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.restaurant.model.Category;
import com.intern.restaurant.service.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryRestController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/create/")
	public ResponseEntity<?> createCategory(@RequestBody Category category){
		return ResponseEntity.ok(categoryService.createCategory(category));
	}
	
	@GetMapping("/list/")
	public ResponseEntity<?> listCategory() {
		return ResponseEntity.ok(categoryService.listCategory());
	}
	
	@PutMapping("/update/{name}")
	public ResponseEntity<?> updateCategory(@PathVariable String name, @RequestBody Category category) {
		return ResponseEntity.ok(categoryService.updateCategory(name, category));
	}
	
	@PutMapping("/update/name/{name}")
	public ResponseEntity<?> updateName(@PathVariable String name, @RequestBody String newname) {
		return ResponseEntity.ok(categoryService.updateCategoryName(name, newname));
	}
	
	@PutMapping("/update/image_link/{name}")
	public ResponseEntity<?> updateImgLink(@PathVariable String name,@RequestBody String new_img_link) {
		return ResponseEntity.ok(categoryService.updateCategoryImageLink(name, new_img_link));
	}
	
	@PutMapping("/update/description/{name}")
	public ResponseEntity<?> updateDescription(@PathVariable String name,@RequestBody String description) {
		return ResponseEntity.ok(categoryService.updateCategoryDescription(name, description));
	}
	
	@PutMapping("/update/type/{name}")
	public ResponseEntity<?> updateType(@PathVariable String name,@RequestBody int type) {
		return ResponseEntity.ok(categoryService.updateCategoryType(name, type));
	}
	
	@DeleteMapping("/delete/name/{name}")
	public void deleteByName(@PathVariable String name) {
		categoryService.deleteByName(name);
	}
}
