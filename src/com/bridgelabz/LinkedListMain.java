package com.bridgelabz;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList1 = new LinkedList<>();
		linkedList1.append(56);
		linkedList1.append(70);

		boolean isInserted = linkedList1.insertAfter(56, 30);
		if (isInserted)
			System.out.println("Element inserted successfully!");
		else
			System.out.println("Element not inserted!");
		linkedList1.show();


		}
	}

