package binarySearchTree;

//find the node in tree for which the value is equal to or closest greater to the value of x
public class CeilInBST {

	Node ceil(Node root,int x) {
		Node res= null;
		while(root!=null) {
			if(root.key==x)
				return root;
			//if root.key < x then any value on left subtree is going to be less than the root so move to right
			else if(root.key<x)
				root=root.right;
			//if root.key > x , update the root to this value, and go to root.left as any value on root.right will be greater than
			//the root value and we want the closest value to the x. Hence we can ignore the right subtree as all values in it 
			//are more greater than x than the root value
			else {
				res=root;
				root=root.left;
			}
		}
		return res;
	}
}
