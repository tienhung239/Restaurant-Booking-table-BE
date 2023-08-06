package com.intern.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.restaurant.model.Post;
import com.intern.restaurant.service.PostService;

@RestController
@RequestMapping("/post")
public class PostRestController {
	
	@Autowired
	private PostService postService;
	
	@PostMapping("/create/")
	public ResponseEntity<?> createPost(@RequestBody Post post) {
		return ResponseEntity.ok(postService.createPost(post));
	}
	
	@GetMapping("/listpost/")
	public ResponseEntity<?> listPost() {
		return ResponseEntity.ok(postService.listPost());
	}
	
	@GetMapping("/list/")
	public ResponseEntity<?> listPostByCurrentUser() {
		return ResponseEntity.ok(postService.listPostByCurrentUser());
	}
	
	@PutMapping("/update/title/{id}")
	public ResponseEntity<?> updateTitle(@PathVariable int id, @RequestBody String title) {
		return ResponseEntity.ok(postService.updateTitle(id, title));
	}
	
	@PutMapping("/update/thumbnail/{id}")
	public ResponseEntity<?> updateThumbnail(@PathVariable int id, @RequestBody String thumbnail) {
		return ResponseEntity.ok(postService.updateThumbnail(id, thumbnail));
	}
	
	@PutMapping("/update/published/{id}")
	public ResponseEntity<?> updatePublished(@PathVariable int id, @RequestBody int published) {
		return ResponseEntity.ok(postService.updatePublished(id, published));
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable int id) {
		postService.deleteById(id);
	}
}
