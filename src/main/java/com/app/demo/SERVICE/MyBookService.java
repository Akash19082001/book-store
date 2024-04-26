package com.app.demo.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.DTO.MyBook;
import com.app.demo.REPOSITORY.MyBookRepository;
@Service
public class MyBookService {
	@Autowired
	private MyBookRepository bro;
	
	public void SaveBooks(MyBook dt) {
		bro.save(dt);
	}
	
	public List<MyBook> getallbooks( ) {
		return bro.findAll();
	}
	
    public void deleteById(int id) {
    	bro.deleteById(id);
    }
}