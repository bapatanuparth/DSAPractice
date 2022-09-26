package tree;

public class CountNodesOfCompleteBTree {

	//Efficient approach - O(logn * logn)
	//make use of the fact that it is a complete binary tree
	//this means all the nodes in between are present.
	//only leaf nodes might not be present
	public int countNodesEff(Node root) {
	if(root==null) return -1;
	//calculate height till the left end
	int lh = leftHeight(root.left);
	//calculate height till the right end
	int rh= rightHeight(root.right);
	//both heights same meaning all the nodes are filled
	if(lh==rh) {
		//this is the number of nodes in a binary tree fully filled
		return (int)Math.pow(2, lh+1)-1;
	}
	//if not complete, recursively repeat for left and right subtree
	return 1+countNodes(root.left)+countNodes(root.right);
	
	
	}
	
	public int leftHeight(Node root) {
		if(root==null) return 0;
		return leftHeight(root.left)+1;
	}
	
	public int rightHeight(Node root) {
		if(root==null) return 0;
		return rightHeight(root.right)+1;
	}
	
	
	
	//O(n) approach
	public int countNodes(Node root) {
		
		if(root==null)return 0;
		
		return countNodes(root.left)+countNodes(root.right)+1;
	}
	
	
	
}
