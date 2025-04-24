package com.training.ui;

import java.util.Comparator;

import com.training.ds.BinaryTree;
import com.training.ds.BinaryTreeImpl;
import com.training.model.BillItem;
import com.training.model.comparators.BillItemPriceComparator;

public class Main6 {
	
	public static void main(String[] args) {
		Comparator<BillItem> cmp;
		cmp = new BillItemPriceComparator();

		BinaryTree<BillItem> bitemTree;
		bitemTree = new BinaryTreeImpl<>(cmp);

		try {
			bitemTree.insert(new BillItem("DEll", 21, 34000.00));
			bitemTree.insert(new BillItem("IBM", 22, 64000.00));
			bitemTree.insert(new BillItem("IPhone", 23, 150000.00));
			bitemTree.insert(new BillItem("OPPO", 10, 74000.00));
			bitemTree.insert(new BillItem("Redmi", 5, 54000.00));
			bitemTree.inorder();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
