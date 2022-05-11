package com.example.demo.bean.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Book;

@RestController
@RequestMapping("/book")
public class BookController {

	@GetMapping("/all")
	public List<Book> getAllBooks(){
		return List.of(
				new Book(101,"Computers Science",450.50),
				new Book(102,"Head first java",4250.50),
				new Book(103,"Springboot",450.50)
				);
	}
}
