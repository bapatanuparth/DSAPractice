package binarySearchTree;

public class InsertBST {

	public Node insertBST(Node root, int n) {
	
		if(root==null) return new Node(n);
		if(root.key>n)
			root.left=insertBST(root.left, n);
		else if (root.key<n)
			root.right= insertBST(root.right, n);
		return root;
	}
}
