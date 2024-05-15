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
		
		if(list.head==null) {  //insert at head if LinkedList is empty
			list.head=new_node;
		}
		else {
			//to insert at last
			Node temp=list.head; 
			while(temp.next!=null) { //traversing till last node
				temp=temp.next;
			}
			temp.next=new_node;
		}
		
		return list;
	}

	private static LinkedList1 insert(LinkedList1 list, int data, int position) {
		
		Node new_node = new Node(data);
		
		if(position==1) { //insert at head, 1st position -> at index 0
			new_node.next=list.head;
			list.head=new_node;
		}
		else {    
			//insert at nth position
			
			Node temp=list.head;
			
			//going to (n-1)th position   
			for(int i=0;i<position-2;i++) { //i<(pos-2), not i<(pos-1) as counting from 0, so, pos=6 is actually index 5
											
				temp=temp.next; //Incrementing temp until (n-2)th pos (pos-3) and finally  
						//pointing to (n-1)th pos (pos-2), so, i<pos-2, not i<=pos-2
			}
			
			//shifting nth node after new_node
			new_node.next=temp.next; //temp is now at n-1th pos, temp.next is nth node
			
			temp.next=new_node; //inserting new_node at nth pos
		}
		
		return list;
	}
	
	private static LinkedList1 delete(LinkedList1 list,int position) {
		
		if(list.head == null) {
			return null;
		}
		
		Node del_temp=list.head;
		
		if(position==1) {    //delete 1st node
			list.head=del_temp.next;	
		}
		else {      //delete nth node
			Node temp=list.head;
			
			for(int i=0;i<position-2;i++) {  //going to n-1th position (pos-2)
				temp=temp.next; 
			}
			
			//holding nth node in del_temp
			del_temp=temp.next; //temp now at (n-1)th pos, temp.next is nth pos
			
			//dereferencing nth node
			temp.next=del_temp.next; //(n-1)th node is now pointing to (n+1)th node		
		}
		
		return list;
	}
	
	private static Node deleteByVal(Node head, int i) {
		
		if(head == null) {
			return null;
		}
		
		if(head.data == i) {
			head = deleteByVal(head.next, i);
		}
		else {
			head.next = deleteByVal(head.next, i);
		}
		
		return head;
	}
	
	private static Node deleteByNode(Node head, Node delNode) {
		
		if(head == null) {
			return null;
		}
		
		if(delNode == null) {
			System.out.println("Node to delete not found!");
		}
		
		if(head == delNode) {
			head = deleteByNode(head.next, delNode);
		}
		else {
			head.next = deleteByNode(head.next, delNode);
		}
		
		return head;
	}

	private static Node deleteMidNode(Node head) {
		
		if(head == null || head.next == null) {
			return null;
		}
		
		//two pointer approach using slow and fast (to avoid traversing the list more than once)
		Node slow = new Node();
		slow.next = head; //slow starts from the previous node of the head node
		Node fast = head; //fast starts from the head node
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next; //slow advances once
			fast = fast.next.next; //fast advances twice
		}
		//fast is now the last node, while slow is the previous node of the middle node
		slow.next = slow.next.next; //deleting slow.next, i.e the middle node
		
		return head;
	}

	private void show(Node head) {
		
		if(head == null) {
			System.out.println("The list is Empty!");
		}
		else {
			System.out.println("The list is: ");
			
			while(head!=null) {
				System.out.print(head.data+" ");
				head = head.next;
			}	
		}	
	}

	public static void main(String[] args) {
		
		LinkedList1 list = new LinkedList1();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);

		list.show(list.head);
		System.out.println();
		
		System.out.println("\nInsertVal : ");
		list = insert(list, 10, 2);
		list.show(list.head);
		System.out.println();
		
		System.out.println("\nAfter DeleteByPos : ");
		list = delete(list, 3);
		list.show(list.head);
		System.out.println();
		
		System.out.println("\nAfter DeleteByVal : ");
		list.head = deleteByVal(list.head, 3);
		list.show(list.head);
		System.out.println();
		
		System.out.println("\nAfter DeleteByNode : ");
		list.head = deleteByNode(list.head, list.head.next.next);
		list.show(list.head);
		System.out.println();
		
		System.out.println("\nAfter DeleteMidNode : ");
		list.head = deleteMidNode(list.head);
		list.show(list.head);
		System.out.println();
		
		System.out.println("\nAfter DeleteMidNode : ");
		list.head = deleteMidNode(list.head);
		list.show(list.head);
		System.out.println();
		
		System.out.println("\nAfter DeleteByVal : ");
		list.head = deleteByVal(list.head, 1);
		list.show(list.head);
		System.out.println();
		
		System.out.println("\nAfter DeleteByNode : ");
		list.head = deleteByNode(list.head, list.head.next);
		list.show(list.head);
		System.out.println();
		
		System.out.println("\nAfter DeleteByNode : ");
		list.head = deleteByNode(list.head, list.head);
		list.show(list.head);

	}
}
