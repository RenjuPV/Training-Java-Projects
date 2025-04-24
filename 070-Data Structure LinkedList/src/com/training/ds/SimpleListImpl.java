package com.training.ds;

public class SimpleListImpl<T> implements List<T> {

	public Node<T> head;

	@Override
	public void insert(T data) throws Exception {

		// Create a new node with given data
		Node<T> new_node = new Node(data);
		new_node.next = null;

		// if linked list is empty,then make the new node as head
		if (head == null)
			head = new_node;
		else {

			// traverse till the last node and insert the new_node there
			Node<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			// Insert the new_node at last node
			current.next = new_node;
		}

	}

	@Override
	public void display() {
		Node<T> current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}

	}

	@Override
	public void insert(int position, T data) throws Exception {

		if (position == 0 && head != null) {
			Node<T> new_node = new Node(data);
			new_node.next = head;
			head = new_node;
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

	@Override
	public T get(int position) {
		int index = 0;
		Node<T> current = head;
		while (current != null) {

			if (index == position)
				return current.data;
			index++;
			current = current.next;
		}
		return null;
	}

}
