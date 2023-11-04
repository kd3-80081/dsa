package com.assn4Q4;



public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node head;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {

		Node newNode = new Node(data);
		if (isEmpty())
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void middleEle() {
		Node slow=head;
		Node fast=head;
		while (fast.next != null) {
			
			fast = fast.next.next;
			slow=slow.next;
		}
		
		System.out.println("Middle element : "+ slow.data);
		
	}

	public void display() {
		Node trav = head;
		System.out.print("  LinkedList : ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
	}
	
	public void reverseLinkedList() {
		Node t1=head;
		Node t2=head.next;
		
		head.next=null;
		while(head!=null) {
			head=t2.next;
			t2.next=t1;
			t2.next=t1;
			t1=t2;
			t2=head;
			
		}
		head=t1;
		Node trav = head;
		System.out.print("R LinkedList : ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		
	}
}