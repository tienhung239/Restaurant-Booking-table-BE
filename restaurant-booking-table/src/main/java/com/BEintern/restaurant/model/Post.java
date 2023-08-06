package com.intern.restaurant.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ps_id;
	
	@Column(name = "ps_title")
	private String title;
	
	@Column(name = "ps_thumbnail_link")
	private String thumbnail;
	
	@Column(name = "ps_created_date")
	private LocalDateTime created_date;
	
	@Column(name = "ps_published")
	private int published;
	
	@ManyToOne
	@JoinColumn(name = "cf_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "us_id")
	private User user;
}
