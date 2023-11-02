package assn3Q6;

public class QueueAsStack {
	private int arr[];
	private int rear,front;
	private final int SIZE;

	public QueueAsStack(int size) {
		this.SIZE=size;
		arr= new int[SIZE];
		front=-1;
		rear=-1;
	}
	
	public void push(int data) {
		rear++;
		arr[rear] = data;
	}
	public void pop() {
	
		rear--;
	}
	
	public int peek() {
		
		return arr[rear];
	}
	
	public boolean isFull() {
		return rear == SIZE -1;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
	
}
