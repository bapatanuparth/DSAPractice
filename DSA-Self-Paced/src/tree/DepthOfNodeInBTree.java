package tree;

public class DepthOfNodeInBTree {

	int findDepth(Node root, int x)
	{
	     
	    // Base case
	    if (root == null)
	        return -1;
	 
	    // Initialize distance as -1
	    int dist = -1;
	 
	    // Check if x is current node=
	    if ((root.key == x)||
	     
	        // Otherwise, check if x is
	        // present in the left subtree
	        (dist = findDepth(root.left, x)) >= 0 ||
	         
	        // Otherwise, check if x is
	        // present in the right subtree
	        (dist = findDepth(root.right, x)) >= 0)
	 
	        // Return depth of the node
	        return dist + 1;
	         
	    return dist;
	}
}
