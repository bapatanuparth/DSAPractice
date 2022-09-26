package tree;

//maximum element of the tree
public class MaximumInTree {

	public static int getMax(Node root) {
		if(root==null)return Integer.MIN_VALUE;
		return Math.max(root.key, Math.max(getMax(root.left),getMax(root.left)));
	}
}
