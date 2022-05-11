package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.bean.Book;

@FeignClient(name="book-service",url = "http://localhost:8080/book")
public interface BookConsumer {


	@GetMapping("/all")
	public List<Book> getAllBooks();

	

}
