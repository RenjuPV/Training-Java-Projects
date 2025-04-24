package com.training.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Customer {

	int id;
	String name;

	@Autowired
	@Qualifier("ChennaiAddress")
	Address address;

	@PostConstruct
	public void init() {
		System.out.println("Customer Object created");
	}

	@PreDestroy
	public void clean() {
		System.out.println("Customer Object destroyed");
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
