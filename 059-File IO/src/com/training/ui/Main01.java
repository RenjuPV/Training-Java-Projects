package com.training.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main01 {
	
	public static void main(String[] args) throws IOException {
		
		InputStream is=new FileInputStream("hello.txt");
		
		while(true) {
			int i=is.read();
			if(i==-1)
				break;
			char ch=(char)i;
			System.out.println(ch);
		}
		is.close();
		
		
	}

}
