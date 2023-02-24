package testDSA;

public class BST_LevelOrderTraverse {
	
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

	

	private int height(Node root) {

		if(root == null) {
			return -1;
		}
		else if(root.left == null && root.right == null) {
			return 0;
		}
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);
			
			if(lheight>rheight) {
				return lheight+1;
			}
			else {
				return rheight+1;
			}
		}
	}

	
	
	private void print() {

		
		int h = height(root);
		for(int i=0; i<=h; i++) {
			printLevel(root, i);
		}
		
	}
	

	
	private void printLevel(Node root, int level) {

		if(root == null) {
			return;
		}
		else {
			if(level == 0) {
				System.out.print(root.data+" ");
			}
			else if(level > 0 ){
				printLevel(root.left, level-1);
				printLevel(root.right, level-1);
			}
		}
		
	}




	public static void main(String[] args) {
		
		
		BST_LevelOrderTraverse bst = new BST_LevelOrderTraverse();
		
		root = bst.new Node(50);
		root.left = bst.new Node(40);
		root.right = bst.new Node(60);
		root.left.left = bst.new Node(30);
		root.left.right = bst.new Node(44);
		
		System.out.println("Breadth First or Level Order Traversal : ");
		bst.print();

	}

}
