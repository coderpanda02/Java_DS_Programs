package testDSA;

public class LinkedList2_Reverse {
	
	static Node head = null;
	
	static class Node{
		
		int data;
		Node next;
		
		public Node() {
		}
		
		public Node(int d) {

			data = d;
			next = null;
		}		
	}

	private void insert(int data) {
		
		Node new_node = new Node(data);
		
		if(head==null) {
			head=new_node;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
		
	}
	
	
//	private static Node ListReverse(Node head) {
	
//			// using iterative method  ---->
//		
//			Node prev = null;
//			Node current = head;
//			Node next = null;
//			
//			while(current!=null) {
//				next = current.next; //holding current.next value for future operations
//				current.next = prev; //pointing current.next to previous node
//				prev = current;   //incrementing previous to current node
//				current = next;   //incrementing current to next node
//				
//			}
//			head = prev;
//			return head;
//		}
	

	private static Node ListReverse(Node head) {
		
		// using recursive method ---->
			
		if(head==null || head.next==null) { 
			return head;
		}	
		
		Node reverse = ListReverse(head.next);	
		
		Node temp = head.next;
		temp.next = head;
		head.next = null;
		
		return reverse;
	}
	
	
	private static void Print(Node head2) {
	
	while(head2!=null) {
		System.out.print(head2.data+" ");
		head2 = head2.next;
		
	}
}



	public static void main(String[] args) {
		
		LinkedList2_Reverse list = new LinkedList2_Reverse();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		System.out.println("Before Reversal: ");
		Print(head);
		System.out.println();
		head = ListReverse(head);
		System.out.println("After Reversal: ");
		Print(head);

	}


}
