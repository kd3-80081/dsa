package 
com.assn4Q9;

public class MaxEleLinkedList {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
				
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		list.addFirst(40);
		list.display();
		
		System.out.println("");
		System.out.println("max : "+ list.maxEle());

	}

}
