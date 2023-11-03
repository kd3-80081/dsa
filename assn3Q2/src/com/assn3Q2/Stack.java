package com.assn3Q2;

public class Stack {
	private int top;
	private int arr[];
	private int SIZE;

	public Stack(int size) {
		top = -1;
		SIZE = size;
		arr = new int[SIZE];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public void push(int data) {
		top++;
		arr[top] = data;
	}

	public int pop() {
		int data = arr[top];
		top--;
		return data;
	}

	public int peek() {
		return arr[top];
	}

}
