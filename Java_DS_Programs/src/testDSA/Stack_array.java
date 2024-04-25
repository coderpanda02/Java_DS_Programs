package testDSA;

public class Stack_array {
	
	int max = 10;
	int[] stack = new int[max];
	int top;
	
	public Stack_array(){
		top = -1;
	}
	
	private boolean isFull() {
		if(top == max-1) {
			return true;
		}
		return false;
	}
		
	private boolean isEmpty() {
		if(top<0) {
			return true;
		}
		return false;
	}
	
	private void push(int i) {
		if(isFull()) {
			System.out.println("Stack Overflow");
		}
		else {
			stack[++top] = i;
		}
	}
	
	private int pop() { 
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}
		return stack[top--]; //returning the deleted value then decrementing top
	}

	private int peek() { //peek at the top element
		if(isEmpty()) {
			return 0;
		}
		return stack[top];
	}


	private void show() {
		for(int i=top; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}
		
	public static void main(String[] args) {
		
		Stack_array stack1 = new Stack_array();
		
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		
		System.out.println("Stack after performing Push operation : ");
		stack1.show();
		
		System.out.println("\nTop value of Stack after performing Push operation : "+stack1.peek());
		
		System.out.println("\nPopped value: "+stack1.pop());
		
		System.out.println("\nStack after performing Pop operation : ");
		stack1.show();
		
		System.out.println("\nTop value of Stack after performing Pop operation : "+stack1.peek());
		
	}

}
