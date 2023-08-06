package com.intern.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.restaurant.exception.ImageException;
import com.intern.restaurant.model.Food;
import com.intern.restaurant.model.Image;
import com.intern.restaurant.repository.ImageRepository;

@Service
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private ImageRepository imageRepository;

	@Override
	public Image createImage(Image image) {
		// TODO Auto-generated method stub
		return imageRepository.save(image);
	}

	@Override
	public List<Image> listImage() {
		// TODO Auto-generated method stub
		List<Image> listImage = imageRepository.findAll();
		if (listImage.size() == 0)
			throw new ImageException("Image is not found");
		return listImage;
	}

	@Override
	public List<Image> listImageByFoodId(int fd_id) {
		// TODO Auto-generated method stub
		List<Image> listImage = new ArrayList<>();
		for (Image image : imageRepository.findAll()) {
			if (image.getFood().getFd_id() == fd_id) {
				listImage.add(image);
			}
		}
		if (listImage.size() == 0)
			throw new ImageException("Image is not found");
		return listImage;
	}

	@Override
	public boolean updateThumbnail(int im_id, String thumbnail) {
		// TODO Auto-generated method stub
		Optional<Image> o_image = imageRepository.findById(im_id);
		if (o_image.isPresent()) {
			Image image = o_image.get();
			image.setImage_link(thumbnail);
			imageRepository.save(image);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateFoodId(int im_id, int fd_id) {
		// TODO Auto-generated method stub
		Optional<Image> o_image = imageRepository.findById(im_id);
		if (o_image.isPresent()) {
			Image image = o_image.get();
			image.setFood(new Food(fd_id));
			imageRepository.save(image);
			return true;
		}
		return false;
	}
	
	public void deleteById(int im_id) {
		imageRepository.deleteById(im_id);
	}

}
