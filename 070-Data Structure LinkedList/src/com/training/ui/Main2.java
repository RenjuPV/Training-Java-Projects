package com.training.ui;

import com.training.ds.LongLinkedList;

public class Main2 {
	
public static void main(String[] args) {
		
		LongLinkedList list;
		list=new LongLinkedList();
		
		list.insert(100L);
		list.insert(200L);
		list.insert(300L);
		list.insert(400L);
		list.insert(500L);
		
		list.display();
		
	}

}
