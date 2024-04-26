package com.app.demo.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.DTO.BookDto;
@Repository

public interface BookRepository extends JpaRepository<BookDto, Integer> {
	
}
