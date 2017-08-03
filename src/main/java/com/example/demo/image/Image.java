package com.example.demo.image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "image")
public class Image {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getFile_path() {
		return file_path;
	}

	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}

	public Image(int id, String imageName, String file_path) {
		super();
		this.id = id;
		this.imageName = imageName;
		this.file_path = file_path;
	}

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;

	@Column(name = "image_name")
	// @NotEmpty(message = "*Please provide first name")
	private String imageName;

	@Column(name = "file_path")
	// @NotEmpty(message = "*Please provide last name")
	private String file_path;

}
