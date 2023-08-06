package com.intern.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cf_id;
	
	@Column(name = "cf_name", unique = true)
	private String name;
	
	@Column(name = "cf_image_link")
	private String image_link;
	
	@Column(name = "cf_description")
	private String description;
	
	@Column(name = "cf_type")
	private int type;
	
	public Category(int cf_id) {
		this.cf_id = cf_id;
	}
	
}
