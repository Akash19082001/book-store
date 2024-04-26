package com.app.demo.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.DTO.MyBook;
@Repository

public interface MyBookRepository extends JpaRepository<MyBook, Integer> {

}
