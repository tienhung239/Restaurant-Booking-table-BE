package com.intern.restaurant.controller;

import com.intern.restaurant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.intern.restaurant.service.UserService;
import com.intern.restaurant.dto.UserDTO;
import com.intern.restaurant.model.User;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;

	
	@GetMapping("/index")
	public String showHome(Model model, HttpSession session) {
		UserDTO userDTO = (UserDTO) session.getAttribute("user");
		if (userDTO != null) {
			model.addAttribute("user",userDTO);
		}
		return "index";
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
	    model.addAttribute("user", new User());
	     
	    return "register";
	}
	
	@PostMapping("/register/save")
	public String userRegister(User user) {
        userService.createUser(user);
        return "redirect:/register?success";
	}
	
	@GetMapping("/login")
	public String login() {
		return("login");
	}
}
