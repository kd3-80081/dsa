package com.assn3Q7;

import java.util.Stack;

public class Queue {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public void enQueue(int data) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(data);
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}

	public int deQueue() {
		if (s1.isEmpty()) {
			return -1;
		} else {
			int x = s1.peek();
			s1.pop();
			return x;
		}
	}

	public int peek() {
		if (!s1.isEmpty()) {
			return s1.peek();
		} else {
			return -1;
		}
	}

}
