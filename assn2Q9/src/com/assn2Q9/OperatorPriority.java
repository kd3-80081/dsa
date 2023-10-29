package com.assn2Q9;

public class OperatorPriority {
	
	public static int calculate(int op1, char opr, int op2) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		case '%': return op1 % op2;
		}
		return 0;
	}
	
	public static void main(String[] args) {
	

	}

}
