package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Account;
import com.training.model.Payment;

public class Main11 {
	
public static void main(String[] args) {
		
		List<Payment> payments=new LinkedList<>();
		
		payments.add(new Payment("Jan", 1000));
		payments.add(new Payment("Feb", 2000));
		payments.add(new Payment("Mar", 3000));
		payments.add(new Payment("Apr", 4000));
		
		System.out.println(payments.contains(new Payment("Dec",5000)));//false
		
		System.out.println(payments.contains(new Payment("Dec",1000)));//true //equals
		
		System.out.println(payments);
		payments.remove(new Payment("Mar",3000));
		System.out.println(payments);
		
	}

}
