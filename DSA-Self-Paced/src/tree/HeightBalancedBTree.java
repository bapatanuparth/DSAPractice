package tree;

public class HeightBalancedBTree {
	
	//efficient solution O(n)
	//write a function that shows both things --> height of the Btree and boolean if tree is Balanced.
	//using int return type such that -->
	//if val returned == -1 --> tree is not balanced
	//else if val>0 , tree is balanced and height is the value returned
	
	public static int isBalancedEff(Node root) {
		if(root==null)return 0;
		
		//check left side height
		int leftHeight= isBalancedEff(root.left);
		if(leftHeight==-1) return -1;
		
		//check right side height
		int rightHeight = isBalancedEff(root.right);
		if(rightHeight==-1) return -1;
		
		if( Math.abs(leftHeight - rightHeight)>1)return -1;
		else
			return Math.max(leftHeight, rightHeight)+1; 
	}
	
	
	
	//this is a O(n2) solution
	public static boolean isBalanced(Node root) {
		if(root==null) return true;
		if(root.left==null && root.right==null)return true;
		
		return Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
	}
	

	public static int height(Node root) {
		if(root==null)return 0;
		return Math.max(height(root.left), height(root.right))+1;
	}
}
