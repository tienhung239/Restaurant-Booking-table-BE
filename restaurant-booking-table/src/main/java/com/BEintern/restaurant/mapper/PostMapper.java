package com.intern.restaurant.mapper;

import com.intern.restaurant.dto.PostDTO;
import com.intern.restaurant.model.Post;

public class PostMapper {
	public static PostDTO toPostDTO(Post post) {
		PostDTO postDto = new PostDTO();
		postDto.setId(post.getPs_id());
		postDto.setTitle(post.getTitle());
		postDto.setThumbnail(post.getThumbnail());
		postDto.setPublished(post.getPublished());
		return postDto;
	}
}
