package com.intern.restaurant.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable{
	private static final long serialVersionUID = -297553281792804396L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int us_id;
	
	@NotNull(message = "User name can not be NULL")
	@Column(name = "us_username", unique = true)
	private String username;
	
	@NotNull(message = "Please enter the password")
	@Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,15}", message = "Password must be 8-15 characters in length and can include A-Z, a-z, 0-9, or special characters !@#$%^&*_")
	@Column(name = "us_password")
	private String password;
	
	@NotNull(message = "User full name can not be NULL")
	@Pattern(regexp = "[A-Za-z.\\s]+", message = "Enter valid characters in use name")
	@Column(name = "us_fullname")
	private String fullname;
	
	@NotNull(message = "User address can not be NULL")
	@Column(name = "us_address")
	private String address;
	
	@NotNull(message = "Please enter the mobile number")
	@Pattern(regexp = "0{1}[1-9]{1}[0-9]{8}", message = "Enter valid 10 digit mobile number")
	@Column(name = "us_mobile", unique = true)
	private String mobile;
	
	@Column(name = "us_status")
	private int status;
	
	@Column(name = "us_created_data")
	private LocalDateTime created_data;
	
	@Column(name = "us_update_password")
	private int update_password;
	
	@Column(name = "us_group")
	private int group;
	
	@NotNull(message = "Please enter the email")
	@Email
	@Column(name = "us_email", unique = true)
	private String email;	
	
	public User(int us_id) {
		this.us_id = us_id;
	}
	
}
