package com.training.ui;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.training.model.BillItem;

public class Main13 {
	
	public static void main(String[] args) {
		try {
			
			BillItem bi=new BillItem("DELL", 12, 45000.00);
			OutputStream os=new FileOutputStream("billItem.dat");
			ObjectOutputStream oos=new ObjectOutputStream(os);
			oos.writeObject(bi);
			oos.flush();
			oos.close();
			os.close();
			
		}catch (Throwable e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
		
	}

}
