package testDSA;

public class Stack_LinkedList {
	
	static Node head = null;

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

	private void push(int data) {
		
		Node new_node = new Node(data);
		System.out.println("Item pushed");
		if(head==null) {
			head = new_node;
		}
		else {
			new_node.next = head;
			head = new_node;
		}
		
	}

	private void pop() {
		
		if(head==null) {
			System.out.println("Stack is empty");
		}
		else {
			head = head.next;
			System.out.println("Item popped");
		}
		
	}

	
	
	private void print(Node head) {

		System.out.print("Stack is: ");
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}

	
	
	private int top() {

		if(head==null) {
			System.out.println("Stack is empty");
			return 0;
		}
		else {
			System.out.print("Top of Stack: ");
			return head.data;
		}
	}

	
	
	private boolean isEmpty() {

		if(head==null) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
	
	public static void main(String[] args) {
		
		Stack_LinkedList stack = new Stack_LinkedList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.print(head);
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
		stack.push(4);
		stack.push(5);
		stack.print(head);
		System.out.println(stack.top());
		System.out.println("Stack is empty? - "+stack.isEmpty());

	}


}
