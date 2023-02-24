package testDSA;

public class Stack_array {
	
	static final int Max = 1000;
	static int[] arr=new int[Max];
	static int top;
	
	public Stack_array() {
		top = -1;
	}
	

	private void push(int data) {
		
		if(top == Max-1) {
			System.out.println("Stack overflow");
		}
		else {
//			top = top+1;
			arr[++top]=data;
			System.out.println("~Element pushed~");
		}
		
	}
	
	
	private int pop() {

		if(top == -1) {
			System.out.println("Stack is empty");
			return 0;
		}
		else {
			System.out.println("~Element popped~");
			return arr[top--];  //returns the current top after pop operation

		}

	}


	private void print() {

		System.out.print("Stack is: ");
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	
	private boolean isEmpty() {

		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
		
	}


	private int top() {

		if(top==-1) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			System.out.print("Top of the stack: ");
			return arr[top];
		}

	}
	
	
	
	public static void main(String[] args) {
		
		Stack_array stack = new Stack_array();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.print();
		stack.pop();
		System.out.print(stack.top());
		System.out.println();
		stack.push(4);
		stack.push(5);
		stack.print();
		System.out.print(stack.top());
		System.out.println();
		System.out.println("Stack is empty? - "+stack.isEmpty());

	}
	

}
