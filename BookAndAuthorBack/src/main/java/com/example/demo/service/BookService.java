package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BookDTO;
import com.example.demo.model.Book;

public interface BookService {

	List<BookDTO> findAllBooks();
	BookDTO save(Book book);
}
