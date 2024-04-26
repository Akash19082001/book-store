package com.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBookApplication.class, args);
		System.out.println("MY BOOK CREATED...!");
	}

}
