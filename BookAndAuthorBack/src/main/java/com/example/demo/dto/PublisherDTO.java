package com.example.demo.dto;

public class PublisherDTO {

	Long id;
	String name;
	String addressLine;
	String city;
	String state;
	int zip;
	
	public PublisherDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PublisherDTO(Long id, String name, String addressLine, String city, String state, int zip) {
		super();
		this.id = id;
		this.name = name;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
}
