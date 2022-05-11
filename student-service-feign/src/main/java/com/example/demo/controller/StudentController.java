package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Book;
import com.example.demo.feign.BookConsumer;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	BookConsumer bookConsumer;
	
	@GetMapping("/allBooks")
	public List<Book> getBooks(){
		return bookConsumer.getAllBooks();
	}

}
