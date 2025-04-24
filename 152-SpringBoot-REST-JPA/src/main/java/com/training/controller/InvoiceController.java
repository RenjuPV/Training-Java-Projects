package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Invoice;
import com.training.service.InvoiceService;

@RestController
@RequestMapping(value = "/api")
public class InvoiceController {

	@Autowired
	InvoiceService service;

	@PostMapping(value = "/add")
	public Invoice f1(@RequestBody Invoice invoice) {

		return this.service.addNewInvoice(invoice);
	}

	@GetMapping(value = "/showAll", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public List<Invoice> f2() {

		return this.service.getAllInvoice();
	}

	@PutMapping(value = "/modify", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public Invoice f3(@RequestBody Invoice invoice) {

		return this.service.updateInvoice(invoice);
	}

	@GetMapping(value = "/findById/{InvoiceId}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }) // "http://localhost:9081/api/findById/1"
	public Invoice f4(@PathVariable(name = "InvoiceId") int InvoiceId) {
		return this.service.searchInvoice(InvoiceId);

	}

	@DeleteMapping(value = "/delete")
	public boolean f5(@RequestBody Invoice invoice) {

		return this.service.deleteInvoice(invoice);
	}

}
