package testDSA;

public class BST_DeleteNode {
	
	static Node root = null;
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int d) {
			data = d;
			left = right = null;
		}
	}
	
	
	
	private Node delete(Node root, int data) {

		if(root == null) {
			return root;
		}
		else if(data < root.data){
			root.left = delete(root.left, data);
		}
		else if(data > root.data) {
			root.right = delete(root.right,data);
		}
		else {       // data is found
			
			// case 1 : Node has No Child
			if(root.left == null && root.right == null) {
				root = null;
			}
			
			// case 2 : Node has one child
			else if(root.left == null) {
				root = root.right;
			}
			else if(root.right == null) {
				root = root.left;
			}
			
			// case 3 : Node has two child 
			//          -> two approaches : 
			//				1. replace root.data with Min of right subtree
			//				2. replace root.data with Max of left subtree
			
			
			// 1. Min of right subtree
			else {
				Node temp = FindMin(root.right);
				root.data = temp.data;
				root.right = delete(root.right, temp.data);//deleting duplicate
			}
			
			// 2. Max of left subtree
//			else {
//				Node temp = FindMax(root.left);
//				root.data = temp.data;
//				root.left = delete(root.left, temp.data);//deleting duplicate
//			}
			
		}
		
		return root;
	}

	
	
//	private Node FindMax(Node leftChild) {
//		
//		while(leftChild.right != null) {
//			leftChild = leftChild.right;
//		}
//		return leftChild;
//	}



	private Node FindMin(Node rightChild) {
		
		while(rightChild.left != null) {
			rightChild = rightChild.left;
		}
		return rightChild;
	}



	private void print(Node root) {

		if(root == null) {
			return;
		}
		else {
			
			print(root.left);
			System.out.print(root.data+" ");
			print(root.right);
		}
		
	}

	
	
	public static void main(String[] args) {

		BST_DeleteNode bst = new BST_DeleteNode();
		
		root = new Node(15);
		root.left = new Node(12);
		root.right = new Node(18);
		root.left.left = new Node(10);
		root.left.right = new Node(14);
		root.right.left = new Node(16);
		root.right.right = new Node(20);
		
//		root = bst.delete(root, 18);
		root = bst.delete(root, 15);
		System.out.println("Printing in Inorder after Deletion: ");
		bst.print(root);
		System.out.println();
		System.out.print("Root of the tree after deletion: "+root.data);
	}

}
