package com.app.demo.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyBook {
	@Id
	
	private int id;
	private String name;
	private String Author;
	private String price;
	

	public MyBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyBook(int id, String name, String author, String price) {
		super();
		this.id = id;
		this.name = name;
		Author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
		
	

}
