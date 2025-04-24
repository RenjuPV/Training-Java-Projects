package com.training.model;

import java.util.HashSet;
import java.util.Set;

public class Bill {

	private int billNumber;
	private String customerName;
	private Set<BillItem> billItems;
	
	
	
	public Bill(int billNumber, String customerName) {
		super();
		this.billNumber = billNumber;
		this.customerName = customerName;
		billItems=new HashSet<>();
	}
	
	
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Set<BillItem> getBillItems() {
		return billItems;
	}
	public void setBillItems(Set<BillItem> billItems) {
		this.billItems = billItems;
	}
	
	
	public void addBillItem(String itemName,int quantity,double price) {
		BillItem bi=new BillItem(itemName, quantity, price);
		this.billItems.add(bi);
	}
	
	public void printBill() {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Bill Number : "+this.billNumber);
		System.out.println("Customer Name : "+this.customerName);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Slno          Item Name         Quantity         Price        Value");
		System.out.println("--------------------------------------------------------------------------");
		int slno=1;
		double totalBillAmount=0;
		for(BillItem bi:this.billItems) {
			System.out.printf("\n  %d %20s \t%3d \t\t%10.2f \t%10.2f",
					slno,bi.getItemName(),bi.getQuantity(),bi.getPrice(),bi.getItemValue());
			
			totalBillAmount=totalBillAmount+bi.getItemValue();
			slno++;
		}
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.println("Total bill Amount  :"+totalBillAmount);
		System.out.println("----------------------------------------------------------------------------");
		
	}
}
