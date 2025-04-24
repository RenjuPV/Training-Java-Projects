package com.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.VisitorRepository;
import com.training.model.Visitor;

@Service
public class VisitorService {

	@Autowired
	VisitorRepository repo;

	public Visitor addNewVisitor(Visitor visitor) {
		return repo.save(visitor);
	}

	public Visitor updateVisitor(Visitor visitor) {
		return repo.save(visitor);
	}

	public Visitor searchVisitor(Visitor visitor) {
		Optional<Visitor> optional = repo.findById(visitor.getId());
		if (optional.isPresent())
			return optional.get();
		else
			return null;
	}
	
	public Visitor searchVisitor(int id) {
		Optional<Visitor> optional = repo.findById(id);
		if (optional.isPresent())
			return optional.get();
		else
			return null;
	}

	public List<Visitor> getAllVisitors() {
		return repo.findAll();

	}

	public boolean deleteVisitor(Visitor visitor) {
		repo.delete(visitor);
		return true;
	}
	
	
	public List<Visitor> getAllVisitorsBySameName(String name) {
		return repo.findByName(name);

	}
	public List<Visitor> getAllVisitorsByCity(String city) {
		return repo.findByComingfrom(city);

	}
	
	

}
