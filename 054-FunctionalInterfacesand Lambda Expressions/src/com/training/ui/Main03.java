package com.training.ui;

import com.training.model.Acceptor;

public class Main03 {
	public static void main(String[] args) {
		
		Acceptor<String>acceptor1;
		acceptor1=new Acceptor<String>() {
			
			@Override
			public void accept(String obj) {
				System.out.println(obj.toUpperCase());
				
			}
		};
		acceptor1.accept("UST Global");
		
		Acceptor<Integer>acceptor2;
		acceptor2=new Acceptor<Integer>() {
			
			@Override
			public void accept(Integer obj) {
				System.out.println(obj.intValue()*obj.intValue());
				
			}
		};
		
		acceptor2.accept(200);
		
		Acceptor<Double>acceptor3=new Acceptor<Double>() {
			
			@Override
			public void accept(Double obj) {
				System.out.println(obj.intValue()*obj.intValue()*obj.intValue());
				
			}
		};
		
		acceptor3.accept(20.0);
		
	}

}
