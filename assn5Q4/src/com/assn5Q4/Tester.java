package com.assn5Q4;

public class Tester {

	public static void main(String[] args) {
		BST tree=new BST();
		tree.wrapperAdd(6);
		//tree.inOrder();
		tree.wrapperAdd(5);
	//	tree.inOrder();
//		tree.inOrder();
		tree.wrapperAdd(10);
		
		tree.wrapperAdd(50);
		tree.wrapperAdd(60);
		tree.wrapperAdd(30);

		
		tree.inOrder();
		tree.preOrder();
		tree.postOrder();
		tree.DFSTraverse();
		tree.BFSTraverse();
		
		

	}

}
