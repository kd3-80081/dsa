package com.sunbeam;

public class List {
	public class Node {
		private int data;
		private Node pre;
		private Node next;

		public Node(int value) {
			this.data = value;
			this.pre = null;
			this.next = null;
		}// ctor
	}// Node

	private Node head;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addPosition(int value, int pos) {
		Node nn = new Node(value);

		if (isEmpty()) {
			head = nn;
			head.next = nn;
			head.pre = nn;
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			nn.next = trav.next;
			nn.pre = trav;
			trav.next = nn;
			trav.next.pre = nn;
			trav = nn;

		} // else

	}

	public void deletePosition(int pos) {
		if (isEmpty()) {
			System.out.println("List is Empty");
			System.out.println("No element");
			return;
		} else if (head.next == head) {
			head = null;
			System.out.println("One element");
		} else {
			Node trav = head;
			for (int i = 1; i < pos; i++) {
				trav = trav.next;
				System.out.println("For loop");
			}
			System.out.println("Trav : "+trav.data);
			trav.pre.next = trav.next;
			trav.next.pre = trav.pre;
			
			trav = trav.pre;

		}
	}

	public void displayList() {
		if (isEmpty()) {
			return;
		}

		else {
			Node trav = head;
			System.out.println("Forward");
			do {
				System.out.print(" " + trav.data + " -> ");
				trav = trav.next;
			} while (trav != head);
		}
	}

}
