package com.intern.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intern.restaurant.dto.UserDTO;
import com.intern.restaurant.service.UserService;

@RestController
@CrossOrigin("*")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/listusers/")
	public ResponseEntity<List<UserDTO>> getUsers() {
		System.out.println("dskfhds");
	    List<UserDTO> listUsers = userService.getAllUser();
	    return ResponseEntity.ok(listUsers);
	}
	@PutMapping("/update-role/{username}/")
	public ResponseEntity<Boolean> updateRole(@PathVariable String username) {
		Boolean isUpdateRole = userService.updateUserGroup(username, 1);
		return ResponseEntity.ok(isUpdateRole);
	}
	
	@DeleteMapping("/delete/{username}")
	public void deleteUser(@PathVariable String username) {
		userService.deleteByUsername(username);
	}
}
