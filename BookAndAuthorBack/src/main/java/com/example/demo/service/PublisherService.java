package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PublisherDTO;
import com.example.demo.model.Publisher;

public interface PublisherService {

	List<PublisherDTO> findAllPublishers();
	PublisherDTO save(Publisher publisher);
	PublisherDTO findById(Long id);
}
