package com.training.ui;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main12 {
	public static void main(String[] args) {

		
		try {
		byte v1;
		short v2;
		int v3;
		long v4;
		char v5;

		float v6;
		double v7;

		boolean v8;
		String v9;

		InputStream is = null;
		DataInputStream dis = null;

		is=new FileInputStream("mydata.dat");
		dis = new DataInputStream(is);

	
		v1=dis.readByte();
		v2=dis.readShort();
		v3=dis.readInt();
		v4=dis.readLong();
		v5=dis.readChar();
		v6=dis.readFloat();
		v7=dis.readDouble();
		v8=dis.readBoolean();
		v9=dis.readUTF();
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		System.out.println(v8);
		System.out.println(v9);
		dis.close();
		is.close();
		
		}catch (Throwable e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
		
		

	}

}
