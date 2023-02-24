package testDSA;

public class BST_MinMaxValue {
	
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
	
	
	public Node insert(Node root, int i) {
		
		Node new_node = new Node(i);
		if(root == null) {
			root = new_node;
		}
		else if(i <= root.data) {
			root.left = insert(root.left,i);
		}
		else {
			root.right = insert(root.right,i);
		}

		return root;

	}
	
	
	
	
//	private int findMin(Node root) {
	
//		if(root==null) {
//			return -1;
//		}
//		else {
//			while(root.left!=null) {
//				root = root.left;
//			}
//		return root.data;
//		}	
//	}
		
			
//		recursive approach -->
		
		
		private int findMin(Node root) {
			
			if(root==null) {
				return -1;
			}
			else if(root.left==null) {
				return root.data;
			}
			else {
				return findMin(root.left);
			}
	
		}
	
	private int findMax(Node root) {

		if(root == null) {
			return -1;
		}
		else if(root.right == null) {
			return root.data;
		}
		else {
			return findMax(root.right);
		}
	}

	

	public static void main(String[] args) {
		
		BST_MinMaxValue bst = new BST_MinMaxValue();
		Node root = null;
		
		root = bst.insert(root,10); 
		root = bst.insert(root,20);
		root = bst.insert(root,11);
		root = bst.insert(root,40);
		
		
		int min = bst.findMin(root);
		int max = bst.findMax(root);

		System.out.println("Min value in the Binary Search Tree: "+min);
		System.out.println("Max value in the Binary Search Tree: "+max);


	}

	

}
