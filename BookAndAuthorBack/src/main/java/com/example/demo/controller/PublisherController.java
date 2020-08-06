package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PublisherDTO;
import com.example.demo.model.Publisher;
import com.example.demo.service.PublisherService;

@RestController
@RequestMapping("/publishers")
@CrossOrigin(origins = "http://localhost:4200")
public class PublisherController {

	@Autowired
	PublisherService publisherService;
	
	@GetMapping("/getAll")
	public List<PublisherDTO> getAllPublishers(){
		return publisherService.findAllPublishers();
	}
	
	@PostMapping("/save")
	public PublisherDTO savePublisher(@RequestBody Publisher publisher) {
		return publisherService.save(publisher);
		
	}
	
	@GetMapping("/get/{id}")
	public PublisherDTO getPublisherById(@PathVariable("id") Long id) {
		return publisherService.findById(id);
	}
}