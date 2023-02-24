package testDSA;

public class BST_DepthFirst {
	
	static Node root = null;
	class Node{
		
		int data;
		Node left;
		Node right;
		
		public Node(int d) {
			
			data = d;
			left = right = null;
		}
	}
	

	private void PreOrder(Node root) {		
		
		if(root == null) {
			return;
		}
		else {
			
			System.out.print(root.data+" ");
			PreOrder(root.left);
			PreOrder(root.right);
			
		}
		
	}
	
	
	private void InOrder(Node root) {
		
		if(root == null) {
			return;
		}
		else {

			InOrder(root.left);
			System.out.print(root.data+" ");
			InOrder(root.right);
		}
		
	}
	
	
	private void PostOrder(Node root) {
		
		if(root == null) {
			return;
		}
		else {
			
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.print(root.data+" ");
			
		}
		
	}


	

	public static void main(String[] args) {
		
		BST_DepthFirst bst = new BST_DepthFirst();
		
		root = bst.new Node(50);
		root.left = bst.new Node(40);
		root.right = bst.new Node(60);
		root.left.left = bst.new Node(30);
		root.left.right = bst.new Node(44);
		
		System.out.println("Depth First Traversal : ");
		System.out.println();
		System.out.println("Pre Order :");
		bst.PreOrder(root);
		System.out.println();
		System.out.println("In Order :");
		bst.InOrder(root);
		System.out.println();
		System.out.println("Post Order :");
		bst.PostOrder(root);
		System.out.println();
		
	}
}
