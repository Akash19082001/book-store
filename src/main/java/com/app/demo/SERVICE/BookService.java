package com.app.demo.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.DTO.BookDto;
import com.app.demo.REPOSITORY.BookRepository;
@Service
public class BookService {
	@Autowired
	private BookRepository br;
	public void SaveBooks(BookDto dto) {
		br.save(dto);
	}
	
	public List<BookDto>getallbooks( ) {
		return br.findAll();
	}
    public BookDto getBookById(int id) {
    	return br.findById(id).get();
    }
    
    public void deleteById(int id) {
    	br.deleteById(id);
    }
    
}
