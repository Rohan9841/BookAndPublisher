package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookDTO;
import com.example.demo.dto.PublisherDTO;
import com.example.demo.model.Book;
import com.example.demo.model.Publisher;
import com.example.demo.repositories.BookRepository;
import com.example.demo.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepo;
	
	@Override
	public List<BookDTO> findAllBooks() {
		List<Book> books = bookRepo.findAll();
		List<BookDTO> bookDTOlist = new ArrayList<>();
		
		books.forEach(b->{
			bookDTOlist.add(convertBookToDTO(b));
		});
		
		return bookDTOlist;
	}

	@Override
	public BookDTO save(Book book) {
		Book book1 = bookRepo.save(book);
		return convertBookToDTO(book1);
	}

	BookDTO convertBookToDTO(Book book) {
		
		BookDTO bookDTO = new BookDTO();
		PublisherDTO publisherDTO = new PublisherDTO();
		
		bookDTO.setId(book.getId());
		bookDTO.setTitle(book.getTitle());
		bookDTO.setIsbn(book.getIsbn());
		bookDTO.setAuthors(book.getAuthors());
		
		Publisher publisher = book.getPublisher();
		
		publisherDTO.setId(publisher.getId());
		publisherDTO.setName(publisher.getName());
		publisherDTO.setAddressLine(publisher.getAddressLine());
		publisherDTO.setCity(publisher.getCity());
		publisherDTO.setState(publisher.getState());
		publisherDTO.setZip(publisher.getZip());
		
		
		bookDTO.setPublisherDTO(publisherDTO);
		
		return bookDTO;
	}
	
}
