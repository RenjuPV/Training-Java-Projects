package com.training.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class StoringUserToFile {

	public void saveUser(User user) throws IOException  {
		OutputStream os = null;
		try {
			os = new FileOutputStream(user.getName() + ".txt");
			Writer writer = new OutputStreamWriter(os);
			writer.write("Name : " + user.getName()+ "\n");
			writer.write("Email : " + user.getEmailId() + "\n");
			writer.write("Phone No : " + user.getPhoneNo() + "\n");

			writer.flush();
			writer.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
