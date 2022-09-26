package binarySearchTree;

//we are given a key, find the closest value smaller than or equal to key in the BST
public class FloorInBST {

	//iterative, no extra space required
	//time -O(h) i,e, height of the tree
	Node floor(Node root,int x) {
		Node res= null;
		while(root!=null) {
			if(root.key==x)
				return root;
			else if(root.key>x)
				root=root.left;
			else {
				res=root;
				root=root.right;
			}
		}
		return res;
	}
	
	
	
	//my code works
	//recursive solution -- requires O(h) extra space
	Node res;
	void floorNode(Node root, int x) {
		if(root==null)return;
		if(root.key>x)floorNode(root.left,x);
		else if(root.key==x)res=root;
		//if root.key< x anything in left subtree cannot be floor as root is largest of them all
		else {
			if(res==null)res=root;
			else if(res!=null && res.key<root.key)
				res=root;
			floorNode(root.right, x);
		}
		
	}
	
	
}
