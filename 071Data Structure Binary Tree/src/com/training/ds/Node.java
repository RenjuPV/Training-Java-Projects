package com.training.ds;

public class Node<T> {
	T key;
	Node left;
	Node right;

	public Node(T item) {
		key = item;
		left = null;
		right = null;
	}

}
