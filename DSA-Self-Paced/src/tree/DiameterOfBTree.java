package tree;

//maximum distance between any 2 leaf nodes

//one approach-->
//find the left height and right height of each node and add 1 to it to get the path length 
//from the leftmost child to right most child of that node.
//take maximum value of this over all the nodes of the tree
public class DiameterOfBTree {
	
	//Efficient solution no extra space
	//keep res as available to all calls
	int res=0;
	
	public int getDiameterEff(Node root) {
		if(root==null)return 0;
	//calculate height and diameter at the same time	
		int lh= getDiameterEff(root.left);
		int rh= getDiameterEff(root.right);
		//all code in function is same as normal height calculation code except the line below
		//in below line we just set the res to max height during recursive calls
		res=Math.max(res, lh+rh+1);
		//
		return 1+Math.max(lh, rh);
	}
	
	
	//Efficient solution O(n)
	//approach-->
	//pre compute height of each node of the tree and store in hashmap <Node, Int>
	//requires extra O(n) space
	
	
	//Naive solution O(n2)
	public static int diameter(Node root) {
		if(root== null) return 0;
		int d1=1+height(root.left)+height(root.right);
		int d2=diameter(root.left);
		int d3=diameter(root.right);
		
		return Math.max(d1, Math.max(d2, d3));
	}
	
	//to calculate height of the tree from any given specific left or right subroot
	public static int height(Node root) {
		if(root==null)return 0;
		else
			return Math.max(height(root.left), height(root.right))+1;
	}
}
