package com.training.ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.training.model.BillItem;
import com.training.model.Circle;

public class Main14 {
	public static void main(String[] args) {

		List list = new ArrayList<>();
		list.add("ABC");
		list.add(Integer.valueOf(200));
		list.add(new Circle(10));
		list.add(new BillItem("Iphone", 2, 40000.00));
		
		for (Object o : list) {
			
			if (o instanceof Integer) {
				Integer temp = (Integer) o;
				System.out.println(temp.intValue());
			}

			if (o instanceof String) {
				String temp = (String) o;
				System.out.println(temp.toUpperCase());
			}
			if (o instanceof Circle) {
				Circle temp = (Circle) o;
				System.out.println(temp.getArea());
			}
			if (o instanceof BillItem) {
				BillItem temp = (BillItem) o;
				System.out.println(temp.getItemValue());
			}
		}
		
		List<String>list1=new LinkedList<>();//pure collection
	}

}
