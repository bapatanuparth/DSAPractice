package tree;

import java.util.ArrayDeque;
import java.util.Deque;

//Level Order Traversal or BFS
public class TreeTraversalBFS {
	
	
	//Using array deque -- my solution
	// time -> O(n) == efficient, space - O(n) vaguely
	//Aux space == width of binary tree --> theta(w) to be accurate
		public static void printBFS(Node root) {
			Deque<Node> ad= new ArrayDeque<>();
			ad.add(root);
			while(!ad.isEmpty()) {
				Node curr=ad.pollFirst();
				if(curr.left!=null)ad.offerLast(curr.left);
				if(curr.right!=null)ad.offerLast(curr.right);
				System.out.println(curr.key);
			}
		}
	
	//Method 2
	//use 1 function to find height of BTree and 2nd function to print all nodes at K distance
	//increment this k to height in loop and call the print K distance function
	
	//inefficient O(n*h)
	public static void printBFS1(Node root) {
		int h=height(root);
		for(int k=0;k<h;k++) {
			printNodes(root, k);
		}
	}
	
	public static int height(Node root) {
		if(root==null)return 0;
		else
			return Math.max(height(root.left), height(root.right))+1;
	}
	
	public static void printNodes(Node root, int k) {
		if(root==null)return;
		if(k==0)
			{
			System.out.println(root.key);
			return;
			}
		else{
			printNodes(root.left, k-1);
			printNodes(root.right, k-1);
		}	
	}
}
