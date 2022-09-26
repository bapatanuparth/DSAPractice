package binarySearchTree;

public class SearchInBST {

	public boolean searchNode(Node root, int n) {
		
		if(root==null) return false;
		else if(root.key==n)return true;
		if(n<root.key)return searchNode(root.left, n);
		else return searchNode(root.right, n);
		
	}
}
