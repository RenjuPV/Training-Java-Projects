package com.training.task;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileLetterCountingTask implements Runnable {

	
	
	private String filename;
	
	public FileLetterCountingTask(String filename) {
		super();
		this.filename = filename;
	}

	@Override
	public void run() {
		int count = 0;
		String name = Thread.currentThread().getName();
		try {
			InputStream is = new FileInputStream(filename);
			while (true) {
				int i = is.read();
				if (i == -1)
					break;
				else {
					count++;
					System.out.println(name +" : " +filename +" counting" + count);
					Thread.sleep(1000);
				}
			}
			System.out.println(name + " : "+filename+" counted...count is : " + count);
			is.close();
		} catch (Exception e) {

			System.err.println(e);
		}

	}

}
