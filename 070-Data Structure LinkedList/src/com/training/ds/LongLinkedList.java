package com.training.ds;

public class LongLinkedList {
	
	public LongNode head;

	public void insert(long data) {

		// Create a new node with given data
		LongNode new_node = new LongNode(data);
		new_node.next = null;
		
		// if linked list is empty,then make the new node as head
		if (head == null)
			head = new_node;
		else {
			
			// traverse till the last node and insert the new_node there
			LongNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			// Insert the new_node at last node
			current.next = new_node;
		}

	}

	public void display() {
		LongNode current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}
