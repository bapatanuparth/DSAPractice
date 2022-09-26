package binarySearchTree;


public class DeleteInBST {
	
	//video code
	Node delNode(Node root, int x) {
		if(root==null)return null;
		else if(root.key>x) {
			root.left= delNode(root.left, x);
		}
		else if(root.key<x) {
			root.right= delNode(root.right, x);
		}
		else {
			if(root.left==null)return root.right;
			else if(root.right==null)return root.left;
			else {
				Node succ= getSucc(root);
				root.key=succ.key;
				root.right=delNode(root.right, succ.key);
			}
		}
		return root;
		
	}
	//find the successor
	//next successor is the next element of root in the in-order traversal of the tree
	Node getSucc(Node root) {
		Node curr=root.right;
		while(curr!=null && curr.left!=null) {
			curr=curr.left;
		}
		return curr;
		
	}
	
	
	///my code -- works fine *******************
	public static Node inOrder(Node root, Node temp) {
		if(root.left==null) {
			temp.key=root.key;
			return null;
		}
		
		root.left=inOrder(root.left,temp);
		return root;
		
	}
	
	
	public Node delete(Node root, int n) {
		if(root==null)return null;
		if(root.key==n) {
			if(root.left==null && root.right==null)
				return null;
			else if(root.left!=null && root.right!=null) {
			 root.right=inOrder(root.right,root);
			return root;	
			}
			else if(root.left!=null)return root.left;
			else
				return root.right;
		}
		if(root.left==null && root.right==null)return root;
		
		root.left=delete(root.left, n);
		root.right=delete(root.right,n);
		
		return root;
		
		
		
	}

}
