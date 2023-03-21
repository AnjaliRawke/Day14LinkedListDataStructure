package com.bridgelabz;

public class LinkedList<T> {

	Node<T> head;
	Node<T> tail;

	public void add(T data) {
		Node<T> newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
}