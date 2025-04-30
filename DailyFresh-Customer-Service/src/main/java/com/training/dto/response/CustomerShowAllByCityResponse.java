package com.training.dto.response;

import java.util.List;

import com.training.model.Customer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerShowAllByCityResponse {
	int statusCode;
	String description;
	List<Customer>customers;

}
