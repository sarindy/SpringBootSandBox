package com.example.demo.image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

	@Autowired
	private ImageRepo imageRepo;

	// javaImage (file://HQB100DIT15/Users/Dy/Pictures/javaImage)
	public void saveImage(Image image) {
		imageRepo.save(image);
	}

}
