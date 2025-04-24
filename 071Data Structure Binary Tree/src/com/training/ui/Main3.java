package com.training.ui;

import com.training.ds.BinaryTree;
import com.training.ds.BinaryTreeImpl;
import com.training.model.Circle;

public class Main3 {

	public static void main(String[] args) {

		BinaryTree<Circle> circlesTree;
		circlesTree = new BinaryTreeImpl();

		try {
			circlesTree.insert(new Circle(34));
			circlesTree.insert(new Circle(30));
			circlesTree.insert(new Circle(20));
			circlesTree.insert(new Circle(25));
			circlesTree.insert(new Circle(15));
			circlesTree.inorder();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
