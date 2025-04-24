package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.model.Address;
import com.training.model.Customer;

@Configuration
public class MyConfiguration2 {
	
	@Bean(name="CochinAddress")
	public Address f3() {
		
		Address address=new Address("56078", "Cochin", "686636");
		return address;
		
	}
	
	@Bean(name="ChennaiAddress")
	public Address f5() {
		
		Address address=new Address("56078", "Chennai", "686636");
		return address;
		
	}
	
	@Bean
	public Customer f4() {
		Customer customer=new Customer();
		customer.setId(0);
		customer.setName("Renju");
		//customer.setAddress(f3());
		
		
		return customer;
		
	}
	

}
