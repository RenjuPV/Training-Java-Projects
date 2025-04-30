package com.training.dto.response;

import com.training.model.Customer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerAddResponse {
	int statusCode;
	String description;
	Customer customer;

}
