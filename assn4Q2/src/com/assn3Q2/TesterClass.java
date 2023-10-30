package com.assn3Q2;

import java.util.Scanner;

public class TesterClass {

	public static void main(String[] args) {
		CircularSLL circularSLL = new CircularSLL();
		int choice;
		Scanner sc = new Scanner(System.in);
		circularSLL.addFirst(10);
		circularSLL.addLast(20);
		circularSLL.addLast(30);
		circularSLL.addLast(40);
		circularSLL.addFirst(5);
		
		
		do {
			System.out.println("0. Exit\n1. Add First\n2. Add Last\n3. Display\n4. Delete First");
			System.out.println("ENTER THE CHOICE");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the Data to insert into node from beginning");
				int data = sc.nextInt();
				circularSLL.addFirst(data);
			}
				break;
			case 2: {
				System.out.println("Enter the Data to insert into node from at the end");
				int data = sc.nextInt();
				circularSLL.addLast(data);
			}
				break;
			case 3: {
				circularSLL.displayList();
			}
				break;
			case 4: {
				circularSLL.deleteFirst();
			}
				break;
			case 5: {
				circularSLL.deleteLast();
			}
				break;
			default:
				System.out.println("WRONG INPUT");
			}
		} while (choice != 0);
		sc.close();

	}

}
