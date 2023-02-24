package testDSA;

public class LinkedList1 {
	
	static class Node{
		int data;
		Node next;
		
		public Node() {
		}
		
		public Node(int d){
			data=d;
			next=null;
		}
		
	}
	
	Node head = null;


	private static LinkedList1 insert(LinkedList1 list, int data) {
		
		Node new_node = new Node(data);
		
		if(list.head==null) {  //insert at head
			list.head=new_node;
		}
		else {
			Node temp=list.head; //to insert at last
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new_node;
		}
		
		return list;
	}

	private static LinkedList1 insert(LinkedList1 list, int data,
										int position) {
		
		Node new_node = new Node(data);
		
		if(position==1) {
			new_node.next=list.head;
			list.head=new_node;
		}
		else {    //insert at nth position
			Node temp=list.head;
			for(int i=0;i<position-2;i++) {  //going to n-1th position
				temp=temp.next;
			}
			new_node.next=temp.next;
			temp.next=new_node;
		}
		
		return list;
	}
	
	private static LinkedList1 delete(LinkedList1 list,int position) {
		
		Node node=list.head;
		if(position==1) {    //delete 1st node
			list.head=node.next;	
		}
		else {      //delete nth node
			Node temp1=list.head;
			for(int i=0;i<position-2;i++) {  //going to n-1th position
				temp1=temp1.next;
			}
			node=temp1.next;
			temp1.next=node.next;
			
		}
//		temp.delete;  think about freeing memory
		return list;
	}
	
	
	
	private static void Print(LinkedList1 list) {
		
		System.out.println("The list is: ");
		
		Node trv=list.head;
		while(trv!=null) {
			System.out.print(trv.data+" ");
			trv=trv.next;
		}
		
	}


	public static void main(String[] args) {
		
		LinkedList1 list = new LinkedList1();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5, 2);
		list = delete(list, 3);
		Print(list);
	}


	
}
