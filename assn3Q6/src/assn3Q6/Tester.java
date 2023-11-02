package assn3Q6;

import java.util.Scanner;

public class Tester {
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("1. Push\n2. pop\n3. peek");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
	int choice, SIZE;
	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER THE SIZE OF STACK");
	SIZE=sc.nextInt();
			
	QueueAsStack st=new QueueAsStack(SIZE);
	
	while((choice=menu(sc))!=0) {
		switch (choice) {
		case 1 :{
			if(st.isFull()) {
				System.out.println("Stack is empty");
			}else {
				System.out.print("Enter data : ");
				int data = sc.nextInt();
				st.push(data);		
			}
		}break;
		case 2 :{
			if(st.isEmpty())
				System.out.println("Queue is Empty");
			else
				st.pop();
		}break;
		case 3 :{
			if(st.isEmpty())
				System.out.println("Queue is Empty");
			else
				System.out.println("Peeked Data : " +st.peek());
		}break;
		default :
			System.out.println("WRONG CHOICE ENTERED");
		}
		
	}

	}

}
