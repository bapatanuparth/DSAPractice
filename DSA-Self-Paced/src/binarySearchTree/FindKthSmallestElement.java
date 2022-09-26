package binarySearchTree;

//given root of BST find Kth smallest element in O(H) time

//for optimum solution --> change node structure of tree and store another variable leftCount which has the count of
//nodes in the left subtree for each node

//if leftCOunt+1==k --> the current node u are on is the Kth Smallest node
// if(leftCount of given node > k --> recur to left subtree as Kth smallest will be on LHS of current
//else if leftCount of current node < k --> recur to the right subtree as the Kth smallest will surely be in the RHS of current
public class FindKthSmallestElement {

	//Naive solution, use in order traversal and count while traversing
	//when count==k it means it has to be kth element from starting
	int count=0;
	//finds in O(n) time
	void printKthNode(Node root, int k) {
		if(root==null) return;
		printKthNode(root.left, k);
		count++;
		if(count==k) {
			System.out.println(root.key);
			return;
		}
		printKthNode(root.right, k);
	}
}
