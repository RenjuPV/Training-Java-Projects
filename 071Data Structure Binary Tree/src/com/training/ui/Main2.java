package com.training.ui;

import com.training.ds.DoubleBinaryTree;

public class Main2 {
	
	public static void main(String[] args) {
		
		DoubleBinaryTree tree=new DoubleBinaryTree();
		tree.insert(60.0);
		tree.insert(30.0);
		tree.insert(40.0);
		tree.insert(80.0);
		tree.insert(70.0);
		
		tree.inorder();
		
	}


}
