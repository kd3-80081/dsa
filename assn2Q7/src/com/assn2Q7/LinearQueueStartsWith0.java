package com.assn2Q7;

public class LinearQueueStartsWith0 {
	private int arr[];
	private int rear, front;
	private final int SIZE;

	public LinearQueueStartsWith0(int size) {
		SIZE = size;
		this.arr = new int[SIZE];
		this.rear = 0;
		this.front = 0;
	}

	public void push(int data) {
		
		
			arr[rear] = data;
			rear++;
		
	}
	
	public void pop() {
		front++;
	}
	
	public int peek() {
		
			return arr[front];	
		
	}
	
	public boolean isFull() {
		return rear==SIZE;
	}
	
	public boolean isEmpty() {
		return rear==front;
	}

}
