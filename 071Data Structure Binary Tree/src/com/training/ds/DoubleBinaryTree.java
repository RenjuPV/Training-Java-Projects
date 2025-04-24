package com.training.ds;

public class DoubleBinaryTree {
	
	DoubleNode root;

	public DoubleBinaryTree() {
		root = null;
	}

	// Method to insert a new node with given key
	public void insert(double key) {

		root = insertRec(root, key);

	}

	// A recursive function to insert a new key in BST
	private DoubleNode insertRec(DoubleNode root, double key) {
		// if the tree is empty,return a new node
		if (root == null) {
			root = new DoubleNode(key);
			return root;

		}

		// Otherwise,recur down the tree
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);
		// return the (unchanged)node pointer
		return root;

	}

	public void inorder() {
		inorderRec(root);
	}

	// A utility function to do inorder traversal of BST
	private void inorderRec(DoubleNode root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key + "");
			inorderRec(root.right);
		}
	}


}
