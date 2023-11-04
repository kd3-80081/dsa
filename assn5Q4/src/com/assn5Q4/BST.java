package com.assn5Q4;

import java.util.*;

public class BST {
	public class Node {
		private int data;
		private Node right;
		private Node left;

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BST() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(Node newNode, Node trav) {

		if (isEmpty()) {
			root=newNode;
			return ;
			
			
		} else {

//			if (count == 0) {
//				trav = root;
//
//			}

			// while (true) {
			if (newNode.data < trav.data) {
				if (trav.left == null) {
					trav.left = newNode;
					return ;
				} else {
					//trav = trav.left;
					//count++;
					addNode(newNode, trav.left);
				}
			} else {
				if (trav.right == null) {
					trav.right = newNode;
					return ;
				} else {
					//trav = trav.right;
				//	count++;
					addNode(newNode, trav.right);
				}
			}
//			}
		}
		
	}
	

	public void wrapperAdd(int value) {
		Node newNode = new Node(value);
		Node trav=root;
		addNode(newNode, trav);
	}

	private void inOrder(Node trav) {
		if (trav == null)
			return;
		// 2. go to the left
		inOrder(trav.left);
		// 1. visit current node
		System.out.print(" " + trav.data);
		// 3. go to the right
		inOrder(trav.right);
	}

	public void inOrder() {
		System.out.print("Inorder : ");
		inOrder(root);
		System.out.println("");
	}
	
	private void preOrder(Node trav) {
		if(trav==null)
			return ;
		System.out.print(" " + trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
	}
	public void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
	}
	private void postOrder(Node trav) {
		if(trav==null)
			return;
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(" " + trav.data);
	}
	
	public void postOrder() {
		System.out.print("PostOrder : ");
		postOrder(root);
		System.out.println("");
	}
	
	public void DFSTraverse() {
		Stack<Node> st=new Stack<>();
		System.out.print("DFS : ");
		st.push(root);
		while(!st.isEmpty()) {
			Node trav=st.pop();
			System.out.print(" " + trav.data);
			if(trav.right!=null)
				st.push(trav.right);
			if(trav.left!=null)
				st.push(trav.left);			
		}
		System.out.println("");
	}
	
	public void BFSTraverse() {
		Queue<Node> qu=new LinkedList<>();
		System.out.print("BSF :");
		qu.offer(root);
		while(!qu.isEmpty()) {
			Node trav=qu.poll();
			System.out.print(" " + trav.data);
			if(trav.left!=null)
				qu.offer(trav.left);
			if(trav.right!=null)
				qu.offer(trav.right);	
		}
		System.out.println("");
		
	}
}
