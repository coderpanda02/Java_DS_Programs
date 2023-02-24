package testDSA;

public class BST_InorderSuccessor {
	

	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int d) {
			data = d;
			left = right = null;
		}
	}
	
	
	private static Node find(Node root, int data) {

		if(root == null) {
			return null;
		}
		else if(data == root.data){
			return root;
		}
		else if(data < root.data){
			return find(root.left,data);
		}
		else {
			return find(root.right,data);
		}

	}
	
	
	private static Node findMin(Node current) {

		if(current == null) {
			return null;
		}
		else {
			while(current.left != null) {
				current = current.left;
			}
			return current;
		}	
	}
	
	
	
	private Node getSuccessor(Node root, int data) {
		
		Node current = find(root, data);

		if(current == null) {
			return null;
		}
		else if(current.right != null) {  //if node current has right child
			return findMin(current.right);
		}
		else {         // if node current has no right child
			Node ancestor = root;
			Node successor = null;
			
			while(ancestor != current) {
				if(current.data < ancestor.data) {
					successor = ancestor;
					ancestor = ancestor.left;
				}
				else {
					ancestor = ancestor.right;	
				}
			}	
			return successor;
		}
	}


	private void printInorder(Node root2) {

		if(root2 == null) {
			return;
		}
		else {
			printInorder(root2.left);
			System.out.print(root2.data+" ");
			printInorder(root2.right);
		}
	}

	
	
	public static void main(String[] args) {

		BST_InorderSuccessor bst = new BST_InorderSuccessor();
		Node root = null;
		
		root = new Node(15);
		root.left = new Node(12);
		root.right = new Node(18);
		root.left.left = new Node(10);
		root.left.right = new Node(14);
		root.right.left = new Node(16);
		root.right.right = new Node(20);
		
		System.out.println("tree in Inorder : ");
		bst.printInorder(root);
		System.out.println();
		int data = 14;
		Node successor = null;
		successor = bst.getSuccessor(root,data);
		if(successor == null) {
			System.out.println("No successor present in the tree for "+data);
		}
		else {
			System.out.print("Inorder Succesor for "+data+" is : "
								+successor.data);

		}
		
	}

}
