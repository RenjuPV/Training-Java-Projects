package com.training.ui;

import com.training.ds.Stack;
import com.training.ds.StackImpl;
import com.training.model.BillItem;

public class Main10 {

	public static void main(String[] args) {

		try {
			Stack<BillItem> stack1 = new StackImpl<>(4);

			stack1.push(new BillItem("Laptop", 10, 500000.00));
			stack1.push(new BillItem("Computer", 5, 550000.00));
			stack1.push(new BillItem("Mouse", 100, 500.00));
			stack1.push(new BillItem("Printer", 105, 5000.00));
			stack1.push(new BillItem("Printer", 105, 5000.00));

			System.out.println(stack1);

			BillItem r = stack1.pop();
			System.out.println(r);
			System.out.println(
					r.getItemName() + " , " + r.getQuantity() + " , " + r.getPrice() + ", " + r.getItemValue());
			System.out.println(stack1);

			BillItem r2 = stack1.pop();
			System.out.println(r2);
			System.out.println(
					r2.getItemName() + " , " + r2.getQuantity() + " , " + r2.getPrice() + ", " + r2.getItemValue());
			System.out.println(stack1);
		} catch (Throwable e) {

			System.err.println(e.getMessage());
		}

	}

}
