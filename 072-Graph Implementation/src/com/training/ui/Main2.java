package com.training.ui;

import com.training.ds.Graph;
import com.training.model.Employee;

public class Main2 {
	
	public static void main(String[] args) {
		
		Graph<Employee>graph=new Graph<>();
		Employee e1=new Employee(101, "Renju", "Female", "Kochi", 10000.00);
		Employee e2=new Employee(102, "Anju", "Female", "TVM", 20000.00);
		Employee e3=new Employee(103, "Manju", "Female", "Chennai", 30000.00);
		Employee e4=new Employee(104, "Sanjay", "Male", "Kottayam", 40000.00);
		Employee e5=new Employee(105, "Anila", "Female", "Kochi", 50000.00);
		
		graph.addVertex(e1);
		graph.addVertex(e2);
		graph.addVertex(e3);
		graph.addVertex(e4);
		graph.addEdge(e1,e2, false);
		
		graph.addEdge(e1, e3, false);
		graph.addEdge(e3,e2, false);
		graph.addEdge(e4, e5, true);
		
		System.out.println(graph.toString());
		
	}

}
