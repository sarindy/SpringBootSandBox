package com.example.demo.image;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ImageController {

	private static String UPLOADED_FOLDER = "C:\\Users\\Dy\\Pictures\\javaImage\\uploads\\";

	@RequestMapping(value = "/api/upload", method = RequestMethod.GET)
	public ModelAndView uploadGet() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/api/image");
		return modelAndView;
	}

	@RequestMapping(value = "/api/upload", method = RequestMethod.POST) 
	public ModelAndView singleFileUpload(@RequestParam("file") MultipartFile file) {

		try {
			
			

			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);
			ModelAndView modelAndView = new ModelAndView();
			System.out.println("The file path is : "+ path.toString());
			modelAndView.addObject("FilePath",path.toString());
			modelAndView.setViewName("/api/imageupload");
			return modelAndView;

		} catch (IOException e) {
			e.printStackTrace();
		}

		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.addObject("FilePath",path.toString());
		modelAndView.setViewName("/api/imageupload");
		return modelAndView;
	}

	@RequestMapping("/api/uploadStatus")
	public String uploadStatus() {
		return "uploadStatus";
	}

}
