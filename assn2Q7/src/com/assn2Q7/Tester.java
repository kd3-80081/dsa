package com.assn2Q7;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		LinearQueueStartsWith0 q = new LinearQueueStartsWith0(5);
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n 1. Push\n2. Pop\n3. peek\n");
			System.out.println("ENTER THE CHOICE");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				if (q.isFull()) {
					System.out.println("Queue is Full");
				} else {
					System.out.println("ENTER THE DATA");
					int data = sc.nextInt();
					q.push(data);
				}
			}
				break;
			case 2: {
				if (q.isEmpty()) {
					System.out.println("Queue is Empty");
				} else {
					q.pop();
				}
			}
				break;
			case 3: {
				if (q.isEmpty()) {
					System.out.println("Queue is Empty");
				} else {
					System.out.println("Peeked data : " + q.peek());
				}
			}
				break;
			default:
				System.out.println("WRONG INPUT");
			}
		} while (choice != 0);
		sc.close();
	}

}
