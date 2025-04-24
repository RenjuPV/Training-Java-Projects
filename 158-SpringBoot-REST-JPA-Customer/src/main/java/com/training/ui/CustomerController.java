package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.dto.request.CustomerAddRequest;
import com.training.dto.request.CustomerDeleteRequest;
import com.training.dto.request.CustomerModifyRequest;
import com.training.dto.response.CustomerAddResponse;
import com.training.dto.response.CustomerDeleteResponse;
import com.training.dto.response.CustomerModifyResponse;
import com.training.dto.response.CustomerSearchResponse;
import com.training.dto.response.CustomerShowAllByNameResponse;
import com.training.dto.response.CustomerShowAllResponse;
import com.training.dto.response.CustomerShowAllByPhoneresponse;
import com.training.exception.CustomerNotFoundException;
import com.training.model.Customer;
import com.training.service.CustomerService;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {

	@Autowired
	CustomerService service;

	@PostMapping(value = "/add")
	public ResponseEntity<CustomerAddResponse> f1(@RequestBody CustomerAddRequest request) {
		Customer customer = this.service.addNewCustomer(request.getCustomer());
		CustomerAddResponse response = new CustomerAddResponse();
		response.setStatusCode(200);
		response.setDescription("Customer Added Successfully");
		response.setCustomer(customer);

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@GetMapping(value = "/showAll", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<CustomerShowAllResponse> f2() {
		CustomerShowAllResponse response = new CustomerShowAllResponse();
		List<Customer> customer = this.service.getAllCustomers();

		if (customer.isEmpty()) {
			response.setStatusCode(200);
			response.setDescription("There is no customers in DB");
			response.setCustomers(null);
		} else {
			response.setStatusCode(200);
			response.setDescription("All Customers Fetched");
			response.setCustomers(customer);
		}
		return ResponseEntity.ok(response);

	}

	@PutMapping(value = "/modify")
	public ResponseEntity<CustomerModifyResponse> f3(@RequestBody CustomerModifyRequest request) {

		CustomerModifyResponse response = new CustomerModifyResponse();

		Customer customer = this.service.searchCustomer(request.getCustomer());

		if (customer != null) {

			Customer customer1 = this.service.updateCustomer(request.getCustomer());
			response.setStatusCode(200);
			response.setDescription("Customer modified Successfully");
			response.setCustomer(customer1);
			return ResponseEntity.ok(response);

		} else {
			response.setStatusCode(404);
			response.setDescription("Customer Not Found for Modification");
			response.setCustomer(null);
			return new ResponseEntity<CustomerModifyResponse>(response, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping(value = "/findById/{cid}")
	public ResponseEntity<CustomerSearchResponse> f4(@PathVariable(name = "cid") int custId) throws Exception {

		CustomerSearchResponse response = new CustomerSearchResponse();
		Customer customer = this.service.searchCustomers(custId);

		if (customer != null) {
			response.setStatusCode(200);
			response.setDescription("Customer fetched successfully");
			response.setCustomer(customer);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {

			Exception exception = new CustomerNotFoundException("Customer Not Found");
			throw exception;
		}

	}

	@GetMapping(value = "/find")
	public Customer f5(@RequestBody Customer customer) {

		return this.service.searchCustomer(customer);
	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<CustomerDeleteResponse> f6(@RequestBody CustomerDeleteRequest request) {
		CustomerDeleteResponse response = new CustomerDeleteResponse();
		Customer customer = this.service.searchCustomer(request.getCustomer());
		if (customer != null) {
			try {
				this.service.deleteCustomer(request.getCustomer());
				response.setStatusCode(200);
				response.setDescription("Customer Deleted Successfully");
				response.setDeleteStatus(true);
				return ResponseEntity.ok().body(response);

			} catch (Exception e) {
				response.setStatusCode(500);
				response.setDescription("Customer Not Deleted");
				response.setDeleteStatus(false);
				return ResponseEntity.internalServerError().body(response);
			}
		} else {
			response.setStatusCode(404);
			response.setDescription("Customer Not found");
			response.setDeleteStatus(false);
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping(value = "/showAllByName/{name}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<CustomerShowAllByNameResponse> f7(@PathVariable(name = "name") String name) {
		CustomerShowAllByNameResponse response = new CustomerShowAllByNameResponse();
		List<Customer> customersBySameName = this.service.getAllCustomersByName(name);
		if (customersBySameName.isEmpty()) {
			response.setStatusCode(200);
			response.setDescription("There is no customers by same name" + name);
			response.setCustomers(customersBySameName);
		} else {
			response.setStatusCode(200);
			response.setDescription("There are " + customersBySameName.size() + "with same name");
			response.setCustomers(customersBySameName);
		}

		return ResponseEntity.ok(response);

	}

	@GetMapping(value = "/showAllByPhone/{phone}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<CustomerShowAllByPhoneresponse> f8(@PathVariable(name = "phone") String phoneNo) {
		CustomerShowAllByPhoneresponse response = new CustomerShowAllByPhoneresponse();
		List<Customer> customerByPhone = this.service.getAllCustomersByPhoneNumber(phoneNo);
		if (customerByPhone.isEmpty()) {
			response.setStatusCode(200);
			response.setDescription("There is no customers with same phone no " + phoneNo);
			response.setCustomers(customerByPhone);
		} else {
			response.setStatusCode(200);
			response.setDescription("There are " + customerByPhone.size() + " same phone numbers");
			response.setCustomers(customerByPhone);
		}

		return ResponseEntity.ok(response);

	}

//	@GetMapping("/showAllByPhoneNo")
//	public ResponseEntity<CustomerShowAllByPhoneresponse> f9(@RequestParam(name = "phone") String phoneNo) {
//		CustomerShowAllByPhoneresponse response = new CustomerShowAllByPhoneresponse();
//		List<Customer> customerByPhone = this.service.getAllCustomersByPhoneNumber(phoneNo);
//		if (customerByPhone.isEmpty()) {
//			response.setStatusCode(200);
//			response.setDescription("There is no customers with  phone no " + phoneNo);
//			response.setCustomers(customerByPhone);
//		} else {
//			response.setStatusCode(200);
//			response.setDescription("There are " + customerByPhone.size() + " customers with phone number " + phoneNo);
//			response.setCustomers(customerByPhone);
//		}
//
//		return ResponseEntity.ok(response);
//
//	}

}
