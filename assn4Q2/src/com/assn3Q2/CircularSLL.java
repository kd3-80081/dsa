package com.assn3Q2;

import java.util.*;

public class CircularSLL {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			next = null;
		}// ctor
	}// class

	private Node tail;
	private int count;

	public CircularSLL() {
		tail = null;
		count = 0;
	}

	public int getCount() {
		return count;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			tail = newNode;
			newNode.next = newNode;

		} else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
		count++;
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;

		}
		count++;
	}

	public void displayList() {
		if (isEmpty())
			return;
		System.out.println("List :");
		Node trav = tail;
		do {
			System.out.println(" " + trav.next.data + " , ");
			trav = trav.next;
		} while (trav != tail);
		System.out.println("");

	}// displayList

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else if (tail.next == tail) {
			tail = null;
		} else {
			tail.next = tail.next.next;
		}
		count--;
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else if (tail.next == tail) {
			tail = null;
		} else {
			Node trav = tail;
//			for (trav = tail; trav.next != tail; trav = trav.next);
//				trav = tail;
			while(trav.next != tail) {
				trav=trav.next;
			}
			trav = tail;
			
		}
		count--;
	}
	
	public void addPosition(int value) {
		
	}

}
