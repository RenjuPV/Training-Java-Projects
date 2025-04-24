package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Visitor;
import com.training.service.VisitorService;

@RestController
@RequestMapping(value = "/api")
public class VisitorController {

	@Autowired
	VisitorService service;

	@PostMapping(value = "/add")
	public Visitor f1(@RequestBody Visitor visitor) {

		return this.service.addNewVisitor(visitor);
	}
	
	@GetMapping(value = "/showAll")
	public List<Visitor> f4() {

		return this.service.getAllVisitors();
	}

	@PutMapping(value = "/modify")
	public Visitor f2(@RequestBody Visitor visitor) {

		return this.service.updateVisitor(visitor);
	}

	@GetMapping(value = "/findById/{vid}")//"http://localhost:9081/api/findById/1"
	public Visitor f3(@PathVariable(name = "vid") int vid) {
		return this.service.searchVisitor(vid);

	}
//	
//	@GetMapping(value = "/findById")//"//http://localhost:9081/api/findById?vid=1"
//	public Visitor f3(@RequestParam(name = "vid") int vid) {
//		return this.service.searchVisitor(vid);
//
//	}
	
	@GetMapping(value = "/find")
	public Visitor f6(@RequestBody Visitor visitor) {

		return this.service.searchVisitor(visitor);
	}

	

	@DeleteMapping(value = "/delete")
	public boolean f5(@RequestBody Visitor visitor) {

		return this.service.deleteVisitor(visitor);
	}

}
