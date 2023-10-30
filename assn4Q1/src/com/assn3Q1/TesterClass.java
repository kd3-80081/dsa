package com.assn3Q1;

import java.util.Scanner;

public class TesterClass {

	public static void main(String[] args) {
		List list = new List();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n 1. Add First\n2. Add Last\n3. Display\n4. Delete First");
			System.out.println("ENTER THE CHOICE");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the Data to insert into node from beginning");
				int data = sc.nextInt();
				list.addFirst(data);
			}
				break;
			case 2: {
				System.out.println("Enter the Data to insert into node from at the end");
				int data = sc.nextInt();
				list.addLast(data);
			}
				break;
			case 3: {
				list.display();
			}
				break;
			case 4: {
				list.deleteFirst();
			}
				break;
			case 5: {
				list.deleteLast();
			}
				break;
			default:
				System.out.println("WRONG INPUT");
			}
		} while (choice != 0);
		sc.close();

	}

}
