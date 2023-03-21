package com.bridgelabz;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList1 = new LinkedList<>();
		linkedList1.append(56);
		linkedList1.append(30);
		linkedList1.append(70);
		linkedList1.append(40);


		Node<Integer> searchedData = linkedList1.search(30);
		if (searchedData == null) {
			System.out.println("Element not found!");
		} else {
			System.out.println("Element Found");
		}

		Integer poppedData1 = linkedList1.popLast();
		if (poppedData1 == null)
			System.out.println("Linked List is Empty");
		else
			System.out.println("The element popped is => " + poppedData1);

//		boolean isInserted = linkedList1.insertAfter(30, 40);
//		if (isInserted)
//			System.out.println("Element inserted successfully!");
//		else
//			System.out.println("Element not inserted!");
		linkedList1.show();
	}
	}

