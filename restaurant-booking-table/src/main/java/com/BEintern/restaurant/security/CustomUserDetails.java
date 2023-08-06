package com.intern.restaurant.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.intern.restaurant.model.User;

public class CustomUserDetails implements UserDetails {
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
     
    public CustomUserDetails(User user) {
        this.user = user;
    }
 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    	List<GrantedAuthority> authorities = new ArrayList<>();
    	if (user.getGroup() == 0) 
    		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
    	else 
    		authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return authorities;
    }
 
    @Override
    public String getPassword() {
        return user.getPassword();
    }
 
    @Override
    public String getUsername() {
        return user.getUsername();
    }
 
    public int getUs_id() {
    	return user.getUs_id();
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }
}