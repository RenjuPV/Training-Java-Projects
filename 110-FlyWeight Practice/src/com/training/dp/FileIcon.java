package com.training.dp;

public class FileIcon implements Icon {

	private String type;
	private String imageName;

	public FileIcon(String type, String imageName) {
		super();
		this.type = type;
		this.imageName = imageName;
	}

	@Override
	public void draw(int x, int y) {

		System.out.println("Drawing file icon with type " + this.type + " and image " + this.imageName);

	}

}
