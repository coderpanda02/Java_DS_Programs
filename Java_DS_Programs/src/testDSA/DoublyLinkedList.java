package testDSA;

public class DoublyLinkedList {
	
	static Node head = null;
	
	static class Node{
		
		int data;
		Node prev;
		Node next;
		
		public Node(){
			
		}
		
		public Node(int d){
			data = d;
			prev = null;
			next = null;
		}
	
	}

	
	private void insertAtHead(int data) {
		
		Node new_node = new Node(data);
		
		if(head==null) {
			head = new_node;
		}
		else {
			head.prev = new_node;
			new_node.next = head;
			head = new_node;
		}
	}
	
	
	private void insertAtTail(int data) {
		
		Node new_node = new Node(data);
		
		if(head == null) {
			head = new_node;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new_node;
			new_node.prev = temp;
		}
		
	}
	
	
	private static void Print(Node head2) {
		
		while(head2!=null) {
			System.out.print(head2.data+" ");
			head2 = head2.next;
		}
		
	}
	
	private static void ReversePrint(Node head2) {
		
		while(head2 != null && head2.next != null) {
			head2 = head2.next;
		}
		System.out.println("Reversed List: ");
		while(head2!=null) {
			System.out.print(head2.data+" ");
			head2 = head2.prev; 
		}
		
	}

	
	

//	given position to be deleted --->
	
	private Node delete(Node head2, int pos) {
		
		if(pos<1) {           //handling null case
			return null;
		}
		if(pos==1) {         //deleting head node
			head2 = head2.next;	
		}
		else {
			Node temp = head2;
			for(int i=0;i<pos-1;i++) {   //covering last naode case also
				temp = temp.next;
			}
			Node prev = temp.prev;  //pointing to (n-1)th node
			prev.next = temp.next;	
		}
		return head2;
		
	}
	
	
	
//	given Node to be deleted --->
	
//	private Node deleteNode(Node head, Node del) 
//    { 
//        // base case 
//        if (head == null || del == null) 
//            return null; 
//  
//        // If node to be deleted is head node 
//        if (head == del) 
//            head = head.next; 
//  
//        // Change next only if node to be  
//        // deleted is NOT the last node 
	
//        if (del.next != null)       //including the case del.prev==null
//            del.next.prev = del.prev; 
//  
//        // Change prev only if node to be  
//        // deleted is NOT the first node 
	
//        if (del.prev != null)       //including the case del.next==null
//            del.prev.next = del.next; 
//  
//        del = null; 
//  
//        return head; 
//    } 
	

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertAtHead(1);
		dll.insertAtHead(2);
		dll.insertAtTail(3);
		dll.insertAtTail(4);
		
		System.out.println("List: ");
		Print(head);
		System.out.println();
		ReversePrint(head);
//		head = dll.delete(head, 0);   //null case test
		head = dll.delete(head, 2);
//		head = dll.deleteNode(head, head.next.next.next);
		System.out.println();
		System.out.println("After Deletion: ");
		Print(head);

	}

}
