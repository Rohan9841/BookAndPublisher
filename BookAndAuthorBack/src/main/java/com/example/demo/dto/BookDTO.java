package com.example.demo.dto;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.model.Author;

public class BookDTO {

	Long id;
	String title;
	String isbn;
	Set<Author> authors = new HashSet<>();
	PublisherDTO publisherDTO;
	
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookDTO(Long id, String title, String isbn, Set<Author> authors, PublisherDTO publisherDTO) {
		super();
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.authors = authors;
		this.publisherDTO = publisherDTO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public PublisherDTO getPublisherDTO() {
		return publisherDTO;
	}

	public void setPublisherDTO(PublisherDTO publisherDTO) {
		this.publisherDTO = publisherDTO;
	}
	
	
	
}
