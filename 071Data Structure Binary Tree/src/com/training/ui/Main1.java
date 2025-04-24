package com.training.ui;

import com.training.ds.IntBinaryTree;

public class Main1 {
	
	public static void main(String[] args) {
		
		IntBinaryTree tree=new IntBinaryTree();
		tree.insert(6);
		tree.insert(3);
		tree.insert(4);
		tree.insert(8);
		tree.insert(7);
		
		tree.inorder();
		
	}

}
