package com.assn3Q1;

import java.util.*;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}// ctor
	}// inner-class

	private Node head;
	private Node tail;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} // if
		else {
			newNode.next = head;
			head = newNode;
		} // else

	}// addFirst

	public void display() {
		if (isEmpty()) {
			System.out.println("Empty");
		}
		Node trav = head;
		System.out.println("List : ");
		while (trav != null) {

			System.out.print("" + trav.data + " , ");
			trav = trav.next;
		}
		System.out.println(" ");
	}// display

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			tail = newNode;
		} // else

	}// addLast

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List Empty");
		} else {
			head = head.next;
			System.out.println("First Node Deleted");
		} // else
	}// deleteFirst

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List Empty");
		} else if (head.next == null)
			head = null;
		else {
			Node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
			System.out.println("Last Node Deleted");
		}//else
	}//delete last

}// list
