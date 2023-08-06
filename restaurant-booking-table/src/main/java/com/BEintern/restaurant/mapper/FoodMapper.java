package com.intern.restaurant.mapper;

import com.intern.restaurant.dto.FoodDTO;
import com.intern.restaurant.model.Food;

public class FoodMapper {

	public static FoodDTO toFoodDTO(Food food) {
		FoodDTO foodDto = new FoodDTO();
		foodDto.setName(food.getName());
		foodDto.setThumbnail(food.getThumbnail());
		foodDto.setPrice(food.getPrice());
		foodDto.setDescription(food.getDescription());
		foodDto.setYoutube_link(food.getYoutube_link());
		
		return foodDto;
	}
}
