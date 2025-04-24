package com.training.dp;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {

	private Map<String, Icon> iconCache = new HashMap<>();

	public Icon getIcon(String key) {
		if (iconCache.containsKey(key))
			return iconCache.get(key);
		else {
			Icon icon;
			if (key.equals("file")) {
				icon = new FileIcon("document", "document.png");
				
			} else if (key.equals("folder")) {
				icon = new FolderIcon("blue", "folder.png");
			} else {
				throw new IllegalArgumentException("Unsupported icon type:" + key);
			}
			iconCache.put(key, icon);
			return icon;
		}
	}

}
