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

import com.intern.restaurant.model.Image;
import com.intern.restaurant.service.ImageService;

@RestController
@RequestMapping("/image")
@CrossOrigin("*")
public class ImageRestController {

	@Autowired
	private ImageService imageService;
	
	@PostMapping("/create/")
	public ResponseEntity<?> createImage(@RequestBody Image image) {
		return ResponseEntity.ok(imageService.createImage(image));
	}
	
	@GetMapping("/list/")
	public ResponseEntity<?> listImage() {
		return ResponseEntity.ok(imageService.listImage());
	}
	
	@GetMapping("/list-by-food-id/{fd_id}")
	public ResponseEntity<?> listImageByFdId(@PathVariable int fd_id) {
		return ResponseEntity.ok(imageService.listImageByFoodId(fd_id));
	}
	
	@PutMapping("/update/thumbnail/{im_id}")
	public ResponseEntity<?> updateThumbnail(@PathVariable int im_id, @RequestBody String thumbnail) {
		return ResponseEntity.ok(imageService.updateThumbnail(im_id, thumbnail));
	}
	
	@PutMapping("/update/food-id/{im_id}")
	public ResponseEntity<?> updateFoodId(@PathVariable int im_id, @RequestBody int food_id) {
		return ResponseEntity.ok(imageService.updateFoodId(im_id, food_id));
	}
	
	@DeleteMapping("/delete/{im_id}")
	public void deleteById(@PathVariable int im_id) {
		imageService.deleteById(im_id);
	}
}
