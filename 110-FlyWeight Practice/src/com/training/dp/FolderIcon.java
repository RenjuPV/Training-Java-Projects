package com.training.dp;

public class FolderIcon implements Icon {

	private String color;
	private String imageName;

	public FolderIcon(String color, String imageName) {
		super();
		this.color = color;
		this.imageName = imageName;
	}

	@Override
	public void draw(int x, int y) {

		System.out.println("Drawing folder icon with color " + this.color + " and image " + this.imageName);
	}

}
