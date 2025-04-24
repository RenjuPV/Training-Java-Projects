package com.training.ui;

import com.training.model.pack2.GoodBye;
import com.training.model.pack2.Greet;
import com.training.model.pack2.Hello;
import com.training.model.pack2.Welcome;

public class Main02 {

	public static void main(String[] args) {
		
		Hello hello;
				
		hello=()->System.out.println("Welcome");
		hello.doIt();
		
		
		Welcome w=new Welcome();
		hello=w::sayWelcome;
		hello.doIt();
		
		hello=()->System.out.println("Good Bye");
		hello.doIt();
		
		GoodBye gb=new GoodBye();
		hello=gb::sayGoodBye;
		hello.doIt();
		
		Greet g=new Greet();
		hello=g::greet;
		hello.doIt();
		
	}

}
