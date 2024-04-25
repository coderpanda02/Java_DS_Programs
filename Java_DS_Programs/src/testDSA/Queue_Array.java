package testDSA;

public class Queue_Array {
	
	static int Max;
	static int[] arr;
	static int front;
	static int rear;
	
	public Queue_Array() {
		
	}
	
	public Queue_Array(int max) {

		front = rear = -1;
		Max = max;
		arr=new int[Max];
	}
	
	
	
	private void enqueue(int data) {

//		if(rear==Max-1) {   //(i+1)%N -->next element (i+N-1)%N-->prev element
		
		if((rear+1)%Max == front) {//-->for circular array-to reuse leftover array
			System.out.println("Queue is full");			
		}
		else if(rear == -1) {
			rear = front = 0;
			arr[rear]=data;
			System.out.println("Enqueue happened");
		}
		else{
//			arr[++rear]=data;
			rear = (rear+1)%Max;
			arr[rear] = data;
			System.out.println("Enqueue happened");

		}
		
	}

	private void dequeue() {

		
		if(front == -1) {
			System.out.println("Queue is empty");		
		}
		else if(front == rear) {
			front = rear = -1;
			System.out.println("Dequeue happened");
		}
		else {
//			front = front + 1;
			front = (front + 1)%Max;
			System.out.println("Dequeue happened");
		}
		
	}

	private void print() {

		if(front==-1 && rear==-1) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.print("Queue is: ");
//			for(int i=front;i<=rear;i++) {
//				System.out.print(arr[i]+" ");
//			}
			int count = (rear+Max-front)%Max + 1;  //for circular array
			for(int i=0;i<count;i++) {
				int index = (front+i) % Max;
				System.out.print(arr[index]+" ");
			}
			System.out.println();

		}
		
		
	}


	public static void main(String[] args) {
		
		Queue_Array queue = new Queue_Array(4);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.print();
		queue.dequeue();
		queue.print();
		queue.enqueue(3);
		queue.print();

	}
}
