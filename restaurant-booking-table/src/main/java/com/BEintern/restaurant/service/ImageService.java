package com.intern.restaurant.service;

import java.util.List;

import com.intern.restaurant.model.Image;

public interface ImageService {
	
	public Image createImage(Image image);
	
	public List<Image> listImage();
	public List<Image> listImageByFoodId(int fd_id);
	
	public boolean updateThumbnail(int im_id, String thumbnail);
	public boolean updateFoodId(int im_id, int fd_id);
	public void deleteById(int im_id);
	
}
