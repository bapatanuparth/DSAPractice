package tree;

//5
/// \
//3   6
/// \
//2   4


//Output:
//Inorder of original tree: 2 3 4 5 6 
//Inorder of mirror tree: 6 5 4 3 2
public class MirrorOfTree {
	
	Node mirror(Node root) {
		
		if(root==null)
			return null;
		Node left= mirror(root.left);
		Node right= mirror(root.right);
		
		root.left=right;
		root.right=left;
		
		return root;
	}

}
