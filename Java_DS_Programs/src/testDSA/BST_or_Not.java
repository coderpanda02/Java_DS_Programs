package testDSA;

//Checking if the tree is Binary Search Tree or not

public class BST_or_Not {
	
	static final int Min = 0;
	static final int Max = 20;
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
	
	
	
	private void isBST(Node root, int minVal, int maxVal) {
		
		boolean check = checkBST(root, minVal, maxVal); 
		
		if(check == true) {
			System.out.println("Tree is a Binary Search Tree");
		}
		else {
			System.out.println("Tree is not Binary Search Tree");
		}
		
	}

	

	private boolean checkBST(Node root, int minVal, int maxVal) {
		
		if(root == null) {
			return true;
		}
		else if((root.data > minVal && root.data < maxVal) && 
				checkBST(root.left, minVal, root.data) && 
				checkBST(root.right, root.data, maxVal)){
			return true;
		}
		else {
			return false;
		}
	}



	public static void main(String[] args) {
		
		BST_or_Not bst = new BST_or_Not();
		
		root = bst.new Node(9);
		root.left = bst.new Node(7);
		root.right = bst.new Node(11);
		root.left.left = bst.new Node(6);
		root.left.right = bst.new Node(8);
		root.right.left = bst.new Node(10);
		root.right.right = bst.new Node(12);
			
		bst.isBST(root, Min, Max);
	}

}
