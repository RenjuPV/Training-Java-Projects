package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Visitor;

@RestController
@RequestMapping("/api")
public class VisitorController {
	
	@GetMapping("showVisitor")
	public Visitor f1() {
		Visitor visitor=new Visitor(101, "Ram", 19, "Male");
		return visitor;
		
		
	}
	
	@GetMapping("visitors")
	public List<Visitor> f2() {
		List<Visitor> allVisitors=new LinkedList<>();
		allVisitors.add(new Visitor(102, "Anju", 34, "Female"));
		allVisitors.add(new Visitor(103, "Renju", 33, "Female"));
		allVisitors.add(new Visitor(104, "Sanju", 32, "Female"));
		return allVisitors;
		
		
	}
	

}
