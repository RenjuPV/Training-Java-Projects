package com.training.ui;

import com.training.model.Acceptor;
import com.training.model.Account;
import com.training.model.AccountAcceptor;
import com.training.model.BillItem;
import com.training.model.BillItemAcceptor;
import com.training.model.Circle;
import com.training.model.CircleAcceptor;
import com.training.model.StringAcceptor;

public class Main02 {
	public static void main(String[] args) {
		
		Acceptor<Circle> acceptor = new CircleAcceptor();
		acceptor.accept(new Circle(10));
		
		Acceptor<Account> acAcceptor = new AccountAcceptor();
		acAcceptor.accept(new Account("Anitha", 1000.00));
		
		Acceptor<BillItem> billItemAcceptor = new BillItemAcceptor();
		billItemAcceptor.accept(new BillItem("Laptop", 10,1000.00));

	}

}
