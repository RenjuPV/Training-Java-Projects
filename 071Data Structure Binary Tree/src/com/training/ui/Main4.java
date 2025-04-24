package com.training.ui;

import com.training.ds.BinaryTree;
import com.training.ds.BinaryTreeImpl;
import com.training.model.CourseItem;

public class Main4 {

	public static void main(String[] args) {

		BinaryTree<CourseItem> courseItemTree;
		courseItemTree = new BinaryTreeImpl();

		try {
			courseItemTree.insert(new CourseItem("HTML", 10, 1000));
			courseItemTree.insert(new CourseItem("JAVA", 25, 2000));
			courseItemTree.insert(new CourseItem("PHP", 30, 3000));
			courseItemTree.insert(new CourseItem("ANGULAR", 5, 4000));
			courseItemTree.insert(new CourseItem("REACT", 15, 5000));

			courseItemTree.inorder();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
