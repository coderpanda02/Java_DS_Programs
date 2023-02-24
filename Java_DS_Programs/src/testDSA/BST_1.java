package testDSA;

//Implementing Binary Search Tree -->

public class BST_1 {
	
//	static Node root=null;->created locally in main
//	(passed in methods - so globally not needed)
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}
	
	private Node insert(Node root, int data) {
		
		Node new_node = new Node(data);
		if(root == null) {
			root = new_node;
		}
		else if(data <= root.data){
			
			root.left = insert(root.left,data);		
		}
		else {
			
			root.right = insert(root.right,data);		
		}
		return root;
		
	}
	
	
	
	private boolean search(Node root,int data) {
		if(root == null) {
			return false;
		}
		else{
			if(root.data == data) {
				return true;
			}
			else if(data <= root.data) {
				return search(root.left,data);
			}
			else {
				return search(root.right,data);
			}
		}
			
	}
	
	
	private void print(boolean search) {
		if(search == false) {
			System.out.println("Item not found");
		}
		else {
			System.out.println("Item found");
		}
		
	}
	

	public static void main(String[] args) {
		
		BST_1 tree = new BST_1();
		Node root = null; 
		root = tree.insert(root, 10);
		root = tree.insert(root, 12);
		root = tree.insert(root, 3);
		root = tree.insert(root, 40);

		boolean search = tree.search(root,12);
		tree.print(search);

	}

}
