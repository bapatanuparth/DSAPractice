package tree;


//total number of nodes in tree
public class SizeOFTree {

	public static int getSize(Node root) {
		if(root==null)return 0;
		return 1+getSize(root.left)+getSize(root.right);
		
	}
}
