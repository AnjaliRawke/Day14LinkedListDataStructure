package com.bridgelabz;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList1 = new LinkedList<>();
		linkedList1.append(56);
		linkedList1.append(30);
		linkedList1.append(70);

		Integer poppedData1 = linkedList1.popLast();
		if (poppedData1 == null)
			System.out.println("Linked List is Empty");
		else
			System.out.println("The element popped is => " + poppedData1);

		linkedList1.show();
	}
	}

