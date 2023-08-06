package com.intern.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intern.restaurant.dto.UserDTO;
import com.intern.restaurant.model.User;

@Service
public interface UserService {
	public User createUser(User user);
	
	public List<UserDTO> getAllUser();
	public User findByUsername(String username);
	public User findByMobile(String mobile);
	public User findByEmail(String email);
	
	public boolean updateUserAddress(String username, String address);
	public boolean updateUserPassword(String username, String newPassword);
	public boolean updateUserEmail(String username, String email);
	public boolean updateUserMobile(String username, String mobile);
	public boolean updateUserGroup(String username, int group);
	
	public void deleteByUsername(String username);
	public void deleteById(int id);
	public void deleteAll();
	
	public int getCurrentUserLogin();
}
