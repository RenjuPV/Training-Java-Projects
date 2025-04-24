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

import com.training.model.Visitor;
import com.training.service.VisitorService;

@RestController
@RequestMapping(value = "/api")
public class VisitorController {

	@Autowired
	VisitorService service;

	@PostMapping(value = "/add")
	public ResponseEntity<Visitor> f1(@RequestBody Visitor visitor) {
		Visitor visitor1 = this.service.addNewVisitor(visitor);
		return new ResponseEntity<>(visitor1, HttpStatus.CREATED);
	}

	@GetMapping(value = "/showAll", produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<List<Visitor>> f4() {
		List<Visitor> visitors = this.service.getAllVisitors();
		// return new ResponseEntity<List<Visitor>>(visitors, HttpStatus.OK);
		return ResponseEntity.ok(visitors);
	}

	@PutMapping(value = "/modify")
	public ResponseEntity<Visitor> f2(@RequestBody Visitor visitor) {

		Visitor visitor1 = this.service.updateVisitor(visitor);

		return new ResponseEntity<Visitor>(visitor1, HttpStatus.OK);
	}

	@GetMapping(value = "/findById/{vid}") // "http://localhost:9081/api/findById/1"
	public ResponseEntity<Visitor> f3(@PathVariable(name = "vid") int vid) {
		Visitor visitor = this.service.searchVisitor(vid);
		if (visitor != null)
			return new ResponseEntity<Visitor>(visitor, HttpStatus.OK);
		else
			return new ResponseEntity<Visitor>(visitor, HttpStatus.NOT_FOUND);

	}
//	
//	@GetMapping(value = "/findById")//"//http://localhost:9081/api/findById?vid=1"
//	public Visitor f3(@RequestParam(name = "vid") int vid) {
//		return this.service.searchVisitor(vid);
//
//	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<Boolean> f5(@RequestBody Visitor visitor) {
		try {
			this.service.deleteVisitor(visitor);
			return new ResponseEntity<Boolean>(true, HttpStatus.OK);
		} catch (Exception e) {
//			return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
			return ResponseEntity.internalServerError().body(false);
		}
	}

	@GetMapping(value = "/find")
	public Visitor f6(@RequestBody Visitor visitor) {

		return this.service.searchVisitor(visitor);
	}

}
