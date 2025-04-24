package com.training.ui;

import com.training.ds.List;
import com.training.ds.LongLinkedList;
import com.training.ds.SimpleListImpl;

public class Main3 {

	public static void main(String[] args) {
		
		List<Integer> iList;
		
		iList=new SimpleListImpl<>();
		
		try {
			iList.insert(Integer.valueOf(100));
			iList.insert(Integer.valueOf(200));
			iList.insert(Integer.valueOf(300));
			iList.insert(Integer.valueOf(400));
			iList.insert(Integer.valueOf(500));
			
			iList.insert(1,Integer.valueOf(10000));
			
			Integer r=iList.get(4);
			System.out.println("Data in position 4 "+r);
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
		
		iList.display();

	}

}
