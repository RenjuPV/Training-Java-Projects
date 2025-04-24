package com.training.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main02 {
	
	public static void main(String[] args) throws IOException {
		
		OutputStream os=new FileOutputStream("welcome.txt");
		String str="I am fine....\nHope you are doing good";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			os.write(ch);
		}
		os.flush();
		os.close();
		
	}

}
