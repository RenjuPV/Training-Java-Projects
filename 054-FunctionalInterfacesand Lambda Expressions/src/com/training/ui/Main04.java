package com.training.ui;

import com.training.model.Acceptor;
import com.training.model.Account;
import com.training.model.BillItem;
import com.training.model.Circle;

public class Main04 {
	public static void main(String[] args) {
		
		Acceptor<Circle>acceptor1=new Acceptor<Circle>() {
			
			@Override
			public void accept(Circle obj) {
				System.out.println(obj.getRadius()+","+obj.getArea());
				
			}
		};
		acceptor1.accept(new Circle(10));

	
	Acceptor<Account>acceptor2=new Acceptor<Account>() {
		
		@Override
		public void accept(Account obj) {
			System.out.println(obj.getCustomerName()+","+obj.getBalance());
			
		}
	};
	acceptor2.accept(new Account("Renju", 1000.00));
	
	
	Acceptor<BillItem>acceptor3=new Acceptor<BillItem>() {
		
		@Override
		public void accept(BillItem obj) {
			System.out.println(obj.toString());
			
		}
	};
	acceptor3.accept(new BillItem("Laptop", 10,100000.00));

}
}
