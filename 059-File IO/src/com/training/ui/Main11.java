package com.training.ui;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main11 {

	public static void main(String[] args) {

		byte v1 = 45;
		short v2 = 2000;
		int v3 = 450000;
		long v4 = 120000000;
		char v5 = 'A';

		float v6 = 345.00f;
		double v7 = 1000.00d;

		boolean v8 = true;
		String v9="Welcome";

		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			os = new FileOutputStream("mydata.dat");
			dos = new DataOutputStream(os);

		} catch (FileNotFoundException e) {
			System.err.println("Someproblem while opening file");
			System.exit(0);
		}

		try {
			dos.writeByte(v1);
			dos.writeShort(v2);
			dos.writeInt(v3);
			dos.writeLong(v4);
			dos.writeChar(v5);
			dos.writeFloat(v6);
			dos.writeDouble(v7);
			dos.writeBoolean(v8);
			dos.writeUTF(v9);

		} catch (IOException e) {
			System.err.println("Some errors while writing");
			System.exit(0);
		}
		try {
			dos.flush();
			dos.close();
			os.close();
			
		}catch (Exception e) {
			System.err.println("Some errors while closing");
			System.exit(0);
		}

	}

}
