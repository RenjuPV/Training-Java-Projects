package com.training.linkedlist;



public class LinkedList<T> {

	public static Node start = null;

	public void addToList(T data) {

		Node<T> new_node = new Node<>(data);
		new_node.nextnode = null;

		
		if (start == null)
			start = new_node;
		else {

			Node<T> current = start;
			while (current.nextnode != null) {
				current = current.nextnode;
			}
			current.nextnode = new_node;
		}

	}

	public void display() {
		Node<T> current = start;
		while (current != null) {
			System.out.println(current.data);
			current = current.nextnode;
		}

	}

	public int count() {
		int count = 0;
		Node<T> current = start;
		while (current != null) {
			count++;
			current = current.nextnode;
		}
		return count;
	}
	
	public void insertAfter(T after, T data) throws Exception {

		if (after == null) {
			
			return;
		}

		int index = 0;
		Node<T> current = head;
		Node<T> previous = null;
		while (current != null) {

			previous = current;
			if (position == index)
				break;
			index++;
			current = current.next;
		}
		Node<T> new_node = new Node(data);
		new_node.next = current.next;
		previous.next = new_node;
	}

}
