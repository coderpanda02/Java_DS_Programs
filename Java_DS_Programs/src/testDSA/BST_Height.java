package testDSA;

public class BST_Height {
	
	class Node{
		
		int data;
		Node left;
		Node right;
		
		public Node(int d) {
			
			data = d;
			left = null;
			right = null;
		}
	}
	

	private Node insert(Node root, int i) {
		
		Node new_node = new Node(i);
		if(root == null) {
			root = new_node;
		}
		else if(i <= root.data){
			
			root.left = insert(root.left, i);
		}
		else {
			root.right = insert(root.right, i);
		}
		
		return root;
	}
	
	

	private int findHeight(Node root) {		

		if(root == null) {
			return -1;
		}
		else if(root.left == null && root.right == null) {
			return 0;
		}
		else {
			int lheight = findHeight(root.left);
			int rheight = findHeight(root.right);
			
			return max(lheight, rheight) + 1;
		}
	}


	

    private int max(int lheight, int rheight) {
    	
    	if(lheight >= rheight) {
    		return lheight;
    	}
    	else {
    		return rheight;
    	}
  	
	}



	public static void main(String[] args) {
		
		Node root = null;
		
		BST_Height bst = new BST_Height();
		root = bst.insert(root, 10);
		root = bst.insert(root, 9);
		root = bst.insert(root, 22);
		root = bst.insert(root, 8);
		root = bst.insert(root, 19);
		root = bst.insert(root, 40);
		root = bst.insert(root, 44);

		
		int height = bst.findHeight(root);
		
		System.out.println("Height of the tree : "+height);
		
		

	}

}
