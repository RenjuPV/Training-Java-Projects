package com.training.ui;

import com.training.ds.IntLinkedList;

public class Main1 {
	
	public static void main(String[] args) {
		
		IntLinkedList list;
		list=new IntLinkedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		
		list.display();
		
	}

}
