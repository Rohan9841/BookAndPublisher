package com.example.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.repositories.AuthorRepository;
import com.example.demo.repositories.BookRepository;
import com.example.demo.repositories.PublisherRepository;
import com.example.demo.service.BookService;

@Component
public class BootStrapData implements CommandLineRunner{

	@Autowired
	final AuthorRepository authorRepo;
	
	@Autowired
	final BookRepository bookRepo;
	
	@Autowired
	final PublisherRepository publisherRepo;
	
	@Autowired
	final BookService bookService;
	
	public BootStrapData(AuthorRepository authorRepo, BookRepository bookRepo, PublisherRepository publisherRepo, BookService bookService) {
		super();
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
		this.publisherRepo = publisherRepo;
		this.bookService = bookService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
//		Publisher publisher = new Publisher("SFG publishing","700 University Ave","Monroe","LA",71209);
//		publisherRepo.save(publisher);
//		
//		Author eric = new Author("Eric","Evans");
//		Book ddd = new Book("Domain Driven Design","123123");
//		
//		eric.getBooks().add(ddd);
//		ddd.getAuthors().add(eric);
//		
//		ddd.setPublisher(publisher);
//		publisher.getBooks().add(ddd);
//		
//		authorRepo.save(eric);
//		bookRepo.save(ddd);
//		publisherRepo.save(publisher);
//		
//		Author rod = new Author("Rod","Johnson");
//		Book noEJB = new Book("J2EE Development with EJB","3939394939");
//		
//		rod.getBooks().add(noEJB);
//		noEJB.getAuthors().add(rod);
//		
//		noEJB.setPublisher(publisher);
//		publisher.getBooks().add(noEJB);
//		
//		authorRepo.save(rod);
//		bookRepo.save(noEJB);
//		publisherRepo.save(publisher);
//		
//		System.out.println("Publisher count: "+publisherRepo.count());
//		System.out.println("Number of books: "+bookRepo.count());
//		System.out.println("Publisher number of books"+ publisher.getBooks().size());
		
		System.out.println("Books: "+bookService.findAllBooks());
		
	}
	
}
