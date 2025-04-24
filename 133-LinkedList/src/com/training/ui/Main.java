package com.training.ui;



import com.training.linkedlist.LinkedList;
import com.training.model.Customer;

public class Main {
	
	public static void main(String[] args) {
		
		Customer customer1=new Customer(1, "Renju");
		Customer customer2=new Customer(2, "Anju");
		Customer customer3=new Customer(3, "Manju");
		Customer customer4=new Customer(4, "Sanju");
		Customer customer5=new Customer(5, "Chinju");
		
		LinkedList<Customer> linkedList=new LinkedList<>();
		
		linkedList.addToList(customer1);
		linkedList.addToList(customer2);
		linkedList.addToList(customer3);
		linkedList.addToList(customer4);
		linkedList.addToList(customer5);
		
		linkedList.display();
		
		System.out.println(linkedList.count());
		
		
	}

}
