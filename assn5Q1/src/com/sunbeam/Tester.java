package 
com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		List list=new List();
		list.addPosition(10, 1);
		list.addPosition(20, 2);
		list.addPosition(30, 3);
		list.addPosition(40, 4);
		list.addPosition(50, 5);
		list.addPosition(60, 6);
		list.displayList();
		list.deletePosition(5);
		System.out.println("\nAfter deletion\n");
//		list.addPosition(80, 2);
		list.displayList();
		
		

	}

}
