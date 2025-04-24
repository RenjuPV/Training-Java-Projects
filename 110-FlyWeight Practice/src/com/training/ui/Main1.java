package com.training.ui;

import com.training.dp.Icon;
import com.training.dp.IconFactory;

public class Main1 {

	public static void main(String[] args) {
		
		IconFactory iconFactory = new IconFactory();

		Icon fileIcon1 = iconFactory.getIcon("file");
		fileIcon1.draw(100, 100);

		Icon fileIcon2 = iconFactory.getIcon("file");
		fileIcon2.draw(150, 150);

		Icon folderIcon1 = iconFactory.getIcon("folder");
		folderIcon1.draw(200, 200);

		Icon folderIcon2 = iconFactory.getIcon("folder");
		folderIcon2.draw(200, 200);

	}

}
