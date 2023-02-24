package testDSA;

public class Queue_LinkedList {
	
	static Node front = null;
	static Node rear = null;

	class Node{
		
		int data;
		Node next;
		
		public Node() {
			
		}
		
		public Node(int d) {
			
			data = d;
			next = null;
		}
	}
	
	
	
	private void enqueue(int data) {
		
		Node new_node = new Node(data);
		if(rear==null) {
			rear = front = new_node;
		}
		rear.next = new_node;
		rear = new_node;
		System.out.println("Enqueue happened");
	}


	private void dequeue() {
		
		if(front==null) {
			System.out.println("Queue is empty");
		}
		else if(front==rear) {
			front = rear = null;
			System.out.println("Dequeue happpened");
		}
		else {
			front = front.next;
			System.out.println("Dequeue happpened");
		}
	}


	private void print(Node front,Node rear) {

		if(front==null && rear==null) {
			System.out.println("Queue is empty");
		}
		else if(front==rear) {
			System.out.print("Queue is: ");
			System.out.print(front.data);
		}
		else {
			System.out.print("Queue is: ");
			while(front!=rear.next) {
				System.out.print(front.data+" ");
				front =front.next;	
			}	
		}
		System.out.println();	
	}


	public static void main(String[] args) {
		
		Queue_LinkedList queue = new Queue_LinkedList();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.print(front, rear);
		queue.dequeue();
		queue.print(front, rear);
		queue.enqueue(3);
		queue.print(front, rear);
		queue.dequeue();
		queue.print(front, rear);

	}



}
