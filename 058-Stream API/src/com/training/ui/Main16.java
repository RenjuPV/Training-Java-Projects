package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.training.model.Employee;
import com.training.model.Payment;

public class Main16 {

	public static void main(String[] args) {
		
		List<Payment> allPayments = new LinkedList<>();

		allPayments.add(new Payment("Jan", 1000.00));
		allPayments.add(new Payment("Jan", 1500.00));
		allPayments.add(new Payment("Jan", 2000.00));
		
		allPayments.add(new Payment("Feb", 100.00));
		allPayments.add(new Payment("Feb", 200.00));
		allPayments.add(new Payment("Feb", 150.00));
		allPayments.add(new Payment("Feb", 300.00));
		
		allPayments.add(new Payment("Mar", 1000.00));
		allPayments.add(new Payment("Mar", 1500.00));
		
		 Map<String,Long>map1=allPayments
				   .stream()
				   .collect(Collectors.groupingBy(Payment::getMonth, Collectors.counting()));
		   System.out.println(map1);
		   
		   Map<String,Double>map2=allPayments
				   .stream()
				   .collect(Collectors.groupingBy(Payment::getMonth, Collectors.summingDouble(Payment::getPaymentAmount)));
		   System.out.println(map2);   
		   
		   
		   Map<String,List<Payment>>map3=allPayments
				   .stream()
				   .collect(Collectors.groupingBy(Payment::getMonth));
		   
		   for(Map.Entry<String, List<Payment>> entry:map3.entrySet()) {
			   System.out.println(entry.getKey());
			   System.out.println("----------------------------------------------------------------");
			   List<Payment>payList=entry.getValue();
			   for(Payment p:payList) {
				   System.out.println(p.toString());
			   }
			   System.out.println("----------------------------------------------------------------");
			   
		   }
		
	}

}
