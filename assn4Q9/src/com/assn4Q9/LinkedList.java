package com.assn4Q9;

public class LinkedList {
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}

	}

	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		// 1. create node with given value
		Node newnode = new Node(data);
		// 2. if list is empty
		if (isEmpty())
			// a. add newnode into head itself
			head = newnode;
		// 3. if list is not empty
		else {
			// a. add first node into next of newnode
			newnode.next = head;
			// b. add newnode into head
			head = newnode;
		}

	}

	public int maxEle() {
		Node trav = head;
		int max = trav.data;
		if (head == null) {
			return -1;
		} else {

			while (trav != null) {
				if (max < trav.data) {
					max = trav.data;

				}
				trav = trav.next;
			}
		}
		return max;
	}

	public void display() {
		Node trav = head;
		System.out.print("List :");
		while (trav != null) {
			// 2. print(visit) the current node
			System.out.print("  " + trav.data);
			// 3. go on next node
			trav = trav.next;
		} // 4. repeat step 2 and 3 till last node
		System.out.println("");
	}
}
