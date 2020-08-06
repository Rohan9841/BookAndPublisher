package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookDTO;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/getAll")
	public List<BookDTO> getAllBooks(){
		return bookService.findAllBooks();
	}
	
	@PostMapping("/save")
	public BookDTO saveBook(@RequestBody Book book) {
		System.out.println("Controller reached.");
		System.out.println("Name of publisher "+book.getPublisher());
		return bookService.save(book);
	}

}
