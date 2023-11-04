package com.assn4Q5;

public class AddBeforeAfterPos {

	public static void main(String[] args) {
		List list=new List();
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.displayList();
		list.addBeforePosition(50, 4);
		System.out.println("");
		list.displayList();
		list.addBeforePosition(450, 0);
		System.out.println("");
		list.displayList();
		list.addBeforePosition(2350, 5);
		System.out.println("");
		list.displayList();

	}

}
