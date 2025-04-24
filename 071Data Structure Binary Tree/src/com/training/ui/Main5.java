package com.training.ui;

import java.util.Comparator;

import com.training.ds.BinaryTree;
import com.training.ds.BinaryTreeImpl;
import com.training.model.BillItem;
import com.training.model.comparators.BillItemQuantityComparator;

public class Main5 {

	public static void main(String[] args) {
		Comparator<BillItem> cmp;
		cmp = new BillItemQuantityComparator();

		BinaryTree<BillItem> bitemTree;
		bitemTree = new BinaryTreeImpl<>(cmp);

		try {
			bitemTree.insert(new BillItem("DEll", 21, 34000.00));
			bitemTree.insert(new BillItem("IBM", 22, 34000.00));
			bitemTree.insert(new BillItem("IPhone", 23, 340000.00));
			bitemTree.insert(new BillItem("OPPO", 10, 34000.00));
			bitemTree.insert(new BillItem("Redmi", 5, 34000.00));
			bitemTree.inorder();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
