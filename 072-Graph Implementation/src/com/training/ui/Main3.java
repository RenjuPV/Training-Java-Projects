package com.training.ui;

import com.training.ds.Graph;
import com.training.model.Account;

public class Main3 {
	
public static void main(String[] args) {
		
		Graph<Account>graph=new Graph<>();
		Account a1=new Account("Renju",10000.00);
		Account a2=new Account("Anju",20000.00);
		Account a3=new Account("Manju",25000.00);
		Account a4=new Account("Sanjay",30000.00);
		Account a5=new Account("Anila",45000.00);
		
		
		
		graph.addEdge(a1,a2, false);
		
		graph.addEdge(a1, a3, false);
		graph.addEdge(a3,a4, false);
		graph.addEdge(a4, a5, true);
		
		System.out.println(graph.toString());
		
	}

}
