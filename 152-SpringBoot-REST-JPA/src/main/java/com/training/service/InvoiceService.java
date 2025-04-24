package com.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.InvoiceRepository;
import com.training.model.Invoice;

@Service
public class InvoiceService {
	
	@Autowired
	InvoiceRepository repo;
	
	public Invoice addNewInvoice(Invoice invoice) {
		return repo.save(invoice);
	}
	
	public Invoice updateInvoice(Invoice invoice) {
		return repo.save(invoice);
	}
	
	public List<Invoice>getAllInvoice(){
		return repo.findAll();
	}
	
	public Invoice searchInvoice(int id) {
		Optional<Invoice>optional=repo.findById(id);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
		
	}
	
	public boolean deleteInvoice(Invoice invoice) {
		
		repo.delete(invoice);
		return true;
	}

}
