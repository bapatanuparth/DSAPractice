package tree;


//watch video vvimp
//O(n2) ==> because of the loop used to search
//can reduce it to O(n) if used hashing --> use a hashmap and search every element's index in hashmap in O(1) time
//Algorithm--->>>>>>

//1. construct tree in pre order traversal
//2.maintain a preIndex variable to point at each node u are joining in tree
//3. pick the element at preIndex-> make it the root -> and search in inOrder traversal array
//4. the position of this element in inOrder traversal will give its left and right subtrees
//5. construct the left and right subtrees recursively and connect with the root as root.left and root.right
//return the root

public class ConstructTreeUsingInAndPreOrder {

	int preIndex=0;
	public Node buildTree(int []pre, int in[], int istart, int iend) {
		//keep 2 pointers istart and iend indicating the start and end indexes
		//these will be useful to divide array based on start and end index to create left and right subtrees
		//these subtrees are created based on the location of root element in inorder traversal array
		if(istart>iend) return null;
		
		//create root using 1st element of preorder elements' array
		//this will be the root of tree during first iteration
		Node root= new Node(pre[preIndex++]);
		
		int inIndex=0;
		//find the location of root element in the inorder array
		//this will give us the left side on LHS of the element and right side on the RHS of this element at inIndex
		for(int i=istart;i<=iend;i++) {
			if(in[i]==root.key) {
				inIndex=i;
				break;
			}
		}
		//once we get the inIndex, make recursive calls to construct left side of the tree and right side of the tree
		root.left= buildTree(pre, in, istart, inIndex-1);
		root.right = buildTree(pre, in, inIndex+1, iend);
		return root;
	}
}
