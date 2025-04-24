package com.training.ds;

import java.util.Comparator;

public class BinaryTreeImpl<T> implements BinaryTree<T> {

	Node root;
	Comparator<T> comparator;

	public BinaryTreeImpl() {
		root = null;
	}

	public BinaryTreeImpl(Comparator cmp) {
		this.comparator = cmp;
	}

	@Override
	public void insert(T key) {
		root = insertRec(root, key);

	}

	private Node insertRec(Node root, T key) {
		// if the tree is empty,return a new node
		if (root == null) {
			root = new Node(key);
			return root;

		}
		int r;
		if(this.comparator==null) {
			Comparable obj1 = (Comparable) key;
			Comparable obj2 = (Comparable<T>) root.key;
			r = obj1.compareTo(obj2);
		}else {
			r=this.comparator.compare(key, (T) root.key);
		}
		

		if (r < 0)
			root.left = insertRec(root.left, key);
		else if (r > 0)
			root.right = insertRec(root.right, key);
		// return the (unchanged)node pointer
		return root;

	}

	@Override
	public void inorder() throws Exception {
		inorderRec(root);

	}

	// A utility function to do inorder traversal of BST
	private void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key + "");
			inorderRec(root.right);
		}

	}
}
