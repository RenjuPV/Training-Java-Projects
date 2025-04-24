package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.BillItem;

public class Main08 {
	
	public static void main(String[] args) {
		
		List<BillItem> billItems=new LinkedList<>();
		
		billItems.add(new BillItem("Samsng", 3, 14000.0));
		billItems.add(new BillItem("Redmi", 3, 14000.0));
		billItems.add(new BillItem("Oppo", 4, 20000.0));
		billItems.add(new BillItem("Iphone", 4, 60000.0));
	
		
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Sl No \t Item Name\t Quanity\t Price\t\tValue\n");
		System.out.println("-----------------------------------------------------------------------------");
		double billAmount=0.0f;
		
		for(int i=0;i<billItems.size();i++) {
			
			System.out.println(i+1+" \t "+billItems.get(i).getItemName()
					+"\t\t"+billItems.get(i).getQuantity()
					+"\t\t"+billItems.get(i).getPrice()+"\t\t"+billItems.get(i).getItemValue());
			billAmount+=billItems.get(i).getItemValue();
			
		}
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Total Number of items:"+billItems.size()+"\t\tBill Amount  :"+billAmount);
		System.out.println("-----------------------------------------------------------------------------");
		
		
	}
	

}
