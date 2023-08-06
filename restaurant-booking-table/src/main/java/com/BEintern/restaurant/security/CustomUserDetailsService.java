package com.intern.restaurant.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.intern.restaurant.exception.UserNotFoundException;
import com.intern.restaurant.model.User;
import com.intern.restaurant.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	 
    @Autowired
    private UserRepository userRepo;
    
//    @Autowired
//    private PasswordEncoder passwordEncoder;
    
    public UserDetails loadUserByUsername(String username) throws UserNotFoundException {
        Optional<User> o_user = userRepo.findByUsername(username);
        if (!o_user.isPresent()) {
            throw new UserNotFoundException("User not found");
        }
        User user = o_user.get();
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return new CustomUserDetails(user);
    }
    
    
 
}
