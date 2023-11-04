package com.assn3Q5;

public class Stack {
	private int SIZE;
	private int top;
	private int arr[];

	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public void push(int data) {
		if (!isFull()) {
			top++;
			arr[top] = data;
		} else {
			System.out.println("Stack is Full");
		}
	}

	public int pop() {
		
		int data;
		if (!isEmpty()) {
			data = arr[top];
			top--;
			return data;
		} else {
			System.out.println("Stack is Empty...");
		}
		return (Integer)null;
	}
	
	

}
